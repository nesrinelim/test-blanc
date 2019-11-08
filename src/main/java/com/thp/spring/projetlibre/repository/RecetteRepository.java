package com.thp.spring.projetlibre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thp.spring.projetlibre.entities.RecetteEntity;
import com.thp.spring.projetlibre.entities.RecetteId;


public interface RecetteRepository extends JpaRepository<RecetteEntity, RecetteId>{
	
	

}
