package com.thp.spring.projetlibre.security;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.thp.spring.projetlibre.repository.UtilisateurRepository;
import com.thp.spring.projetlibre.serviceImp.AppUserDetailsService;



@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	private AppUserDetailsService userDetailsService;
    private UtilisateurRepository utilisateurRepository;
  
	public SecurityConfig(AppUserDetailsService userDetailsService, UtilisateurRepository utilisateurRepository) {
		super();
		this.userDetailsService = userDetailsService;
		this.utilisateurRepository = utilisateurRepository;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
		

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.cors()
		  .and()
			.csrf()
        		.disable()
        	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        	.and()
        // add jwt filters (1. authentication, 2. authorization)
        .addFilter(new JWTAuthentificationFilter(authenticationManager()))
        .addFilter(new JwtAuthorizationFilter(authenticationManager(),  this.utilisateurRepository))
        .authorizeRequests()
		 	.antMatchers("/","/index.html","/app/**","/assets/**","/environments/**").permitAll()
		 	.antMatchers(HttpMethod.GET,"/pizzeria").permitAll()
		 	.antMatchers(HttpMethod.GET,"/produit").permitAll()
		 	.antMatchers(HttpMethod.POST,"/user").permitAll()
		 	.antMatchers(HttpMethod.PUT,"/commande").permitAll()
		 	.antMatchers(HttpMethod.PUT,"/user").permitAll()
         	.anyRequest().authenticated()
		 .and()
		 	.formLogin()
		 		.permitAll()
		 .and()
			.logout()
        		.logoutUrl("/logout")
        	//.deleteCookies("JSESSIONID")
        		.permitAll();

        				
		
	}
	@Bean
	public FilterRegistrationBean simpleCorsFilter() {
	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    CorsConfiguration config = new CorsConfiguration();
	    config.setAllowCredentials(true);
	    config.setAllowedOrigins(Arrays.asList("http://localhost:4200", "http://localhost:4300"));
	    config.setAllowedMethods(Collections.singletonList("*"));
	    config.setAllowedHeaders(Collections.singletonList("*"));
	    config.addExposedHeader("Authorization, x-xsrf-token, Access-Control-Allow-Headers, Origin, Accept, X-Requested-With, " +
                "Content-Type, Access-Control-Request-Method, Custom-Filter-Header");

	    source.registerCorsConfiguration("/**", config);
	    @SuppressWarnings("unchecked")
		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
	    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	    return bean;
	}
	
	

}