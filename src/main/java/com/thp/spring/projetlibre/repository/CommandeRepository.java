package com.thp.spring.projetlibre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thp.spring.projetlibre.dto.CommandeDTO;
import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.util.Etat;

public interface CommandeRepository extends JpaRepository<CommandeEntity, Long> {

	public CommandeEntity findByStatus(Etat etatDispo);

	public List<CommandeEntity> findCommandeByUtilisateurId(Long idUser);


	

}
