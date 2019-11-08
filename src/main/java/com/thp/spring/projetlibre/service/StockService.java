package com.thp.spring.projetlibre.service;

import java.util.List;

import com.thp.spring.projetlibre.dto.StockDTO;
import com.thp.spring.projetlibre.entities.StockEntity;

public interface StockService {
	
	List<StockDTO> findAll();
	StockDTO findById(long idPizzeria, long idIngredient);
	StockEntity upadteStock(StockDTO p, Long idPizzeria, Long idIngredient);
	StockEntity addStock(long idPizzeria, long idIngredient, Double quantite);
	List<StockDTO> findAllIngredientPizza();
	
}
