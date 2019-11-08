package com.thp.spring.projetlibre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thp.spring.projetlibre.entities.ProduitEntity;

public interface ProduitRepository extends JpaRepository<ProduitEntity, Long>{
	
	public ProduitEntity findByNom(String nom);
}
