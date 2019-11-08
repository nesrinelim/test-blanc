package com.thp.spring.projetlibre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.projetlibre.dto.RecetteDTO;
import com.thp.spring.projetlibre.service.RecetteService;

@RestController
@CrossOrigin("*")
public class RecetteController {

	@Autowired
	RecetteService recetteService;

	@GetMapping(value = "/recette")
	public List<RecetteDTO> getAllList() {
		return recetteService.findAll();
	}
	
	@PostMapping(value = "/recette")
	public void addRecette(@RequestParam Long idProduit, @RequestParam Long idIngredient,@RequestParam double quantite, @RequestParam String description) {
		recetteService.addRecette(idProduit,idIngredient,quantite,description);
	}

	@DeleteMapping(value="/recette")
	public void  deleteRecetteById(@RequestParam long idProduit, @RequestParam long idIngredient) {
		recetteService.	deleteRecette(idProduit, idIngredient);
	}

	@PutMapping(value = "/recette")
	public void updateRecette(@RequestParam Long idProduit, @RequestParam Long idIngredient,@RequestParam double quantite, @RequestParam String description) {
		recetteService.addRecette(idProduit,idIngredient,quantite,description);
	}
	
}
