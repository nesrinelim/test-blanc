package com.thp.spring.projetlibre.service;

import java.util.List;

import com.thp.spring.projetlibre.dto.CommandeDTO;
import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.util.Etat;


public interface CommandeService{
	
	
	CommandeDTO findById(Long cmdId);

	CommandeDTO findByStatus(Etat etatDispo);
	
	List<CommandeDTO> findCommandeByUtilisateur(Long idUser);

	List<CommandeDTO> findAll();

	void deleteCommande(Long commandeId);

	CommandeEntity addCommande(CommandeDTO cmdDTO);
	

}
