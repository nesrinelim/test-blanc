package com.thp.spring.projetlibre.service;

import java.util.List;

import com.thp.spring.projetlibre.dto.UtilisateurDTO;
import com.thp.spring.projetlibre.entities.UtilisateurEntity;



public interface UtilisateurService {

	UtilisateurDTO findById(Long utilisateurId);

	UtilisateurDTO findByPseudo(String pseudo);

	List<UtilisateurDTO> findAll();

	void deleteUtilisateur(Long utilisateurId);

	UtilisateurDTO addUtilisateur(UtilisateurDTO utilisateurDTO);

}
