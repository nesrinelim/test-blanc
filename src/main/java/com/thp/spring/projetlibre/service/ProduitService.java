package com.thp.spring.projetlibre.service;

import java.util.List;

import com.thp.spring.projetlibre.dto.ProduitDTO;
import com.thp.spring.projetlibre.entities.ProduitEntity;

public interface ProduitService {
	
	ProduitDTO findById(Long pdtId);

	ProduitDTO findByNom(String nom);

	List<ProduitDTO> findAll();

	void deleteProduit(Long pdtId);

	ProduitEntity addProduit(ProduitDTO pdtDTO);

}
