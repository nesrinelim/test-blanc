package com.thp.spring.projetlibre.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.projetlibre.dto.StockDTO;
import com.thp.spring.projetlibre.dto.StockPizzeriaDTO;
import com.thp.spring.projetlibre.service.StockService;

@RestController(value = "/stock")
@CrossOrigin("*")
public class StockController {
	@Autowired
	StockService stockServiceimpl;

	@GetMapping(value = "/stock")
	public List<StockDTO> getAllstock() {
		return stockServiceimpl.findAll();
	}

	@PostMapping(value = "/stock")
	public void addStock(@RequestParam Long idPizzeria, @RequestParam Long idIngredient,
			@RequestParam Double quantite) {
		System.out.println(idPizzeria + idIngredient + quantite);
		stockServiceimpl.addStock(idPizzeria, idIngredient, quantite);
	}

	@GetMapping(value = "/pizzeria/stock")
	public StockDTO getStockById(@RequestParam Long idPizzeria, @RequestParam Long idIngredient) {
		System.out.println(idPizzeria + idIngredient);
		return stockServiceimpl.findById(idPizzeria, idIngredient);
	}

	@GetMapping(value = "/stockPizzeria")
	public List<StockPizzeriaDTO> getFindAllIngredientPizza() {
		List<StockDTO> allStock = stockServiceimpl.findAll();
		List<StockPizzeriaDTO> stockPizzeriaList = new ArrayList<StockPizzeriaDTO>();
		StockPizzeriaDTO stockPizzeria = new StockPizzeriaDTO();
		
		for (StockDTO stockDTO : allStock) {
			if (stockDTO.getPizzeriaEntity().getId() == 1) {
				stockPizzeria.setNom(stockDTO.getIngredientEntity().getNom());
				stockPizzeria.setQtte(stockDTO.getQuantite());
				stockPizzeriaList.add(stockPizzeria);
			}
		}

		return stockPizzeriaList;
	}

}
