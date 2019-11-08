package com.thp.spring.projetlibre.service;

import java.util.List;

import com.thp.spring.projetlibre.dto.RecetteDTO;
import com.thp.spring.projetlibre.entities.RecetteEntity;

public interface RecetteService {
	


    RecetteDTO findById(long idProduit, long idIngredient);
    
	List<RecetteDTO> findAll();

	void deleteRecette(long idProduit, long idIngredient);

    RecetteEntity addRecette(Long idProduit,Long idIngredient ,double quantite, String description);
	

}
