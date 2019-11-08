package com.thp.spring.projetlibre.serviceImp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.entities.RoleEntity;
import com.thp.spring.projetlibre.entities.UtilisateurEntity;
import com.thp.spring.projetlibre.repository.UtilisateurRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UtilisateurRepository utilisateuRepository;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UtilisateurEntity user = utilisateuRepository.findByPseudo(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + user.getRole().getNom()));

		return new User(user.getPseudo(), user.getMotDePasse(), grantedAuthorities);
	}

}