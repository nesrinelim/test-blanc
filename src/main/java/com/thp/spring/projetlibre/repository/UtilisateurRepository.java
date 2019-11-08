package com.thp.spring.projetlibre.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.thp.spring.projetlibre.entities.UtilisateurEntity;

public interface UtilisateurRepository extends JpaRepository<UtilisateurEntity, Long> {

	public UtilisateurEntity findByPseudo(String login);
}
