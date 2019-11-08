package com.thp.spring.projetlibre.service;

import java.util.List;

import com.thp.spring.projetlibre.dto.IngredientDTO;
import com.thp.spring.projetlibre.entities.IngredientEntity;

public interface IngredientService {
	
	IngredientDTO findById(Long id_ingredient);

	List<IngredientDTO> findAll();

	void deleteIngredient(Long id);

	IngredientEntity addIngredient(IngredientDTO ingredientDTO);

	IngredientEntity upadteIngredient(IngredientDTO p, Long id_ingredient);

}
