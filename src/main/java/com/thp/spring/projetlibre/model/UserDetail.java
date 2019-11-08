package com.thp.spring.projetlibre.model;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.thp.spring.projetlibre.entities.UtilisateurEntity;

public class UserDetail implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7100489810706988647L;
	private UtilisateurEntity user;
	Set<GrantedAuthority> authorities = null;

	public UserDetail(UtilisateurEntity user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.user.getMotDePasse();
	}

	@Override
	public String getUsername() {
		return this.user.getPseudo();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public UtilisateurEntity getUser() {
		return user;
	}

	public void setUser(UtilisateurEntity user) {
		this.user = user;
	}

	public void setAuthorities(Set<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}
}
