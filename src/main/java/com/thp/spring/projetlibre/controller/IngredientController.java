package com.thp.spring.projetlibre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.projetlibre.dto.IngredientDTO;
import com.thp.spring.projetlibre.entities.IngredientEntity;
import com.thp.spring.projetlibre.service.IngredientService;

@RestController(value = "/ingredient")
@CrossOrigin
public class IngredientController {
	@Autowired
	IngredientService ingredientServiceimpl;

	@PostMapping(value = "/ingredient")
	public void addIngredient(@RequestBody IngredientDTO ingredientDTO) {
		ingredientServiceimpl.addIngredient(ingredientDTO);
	}

	
	@GetMapping(value = "/ingredient/{idIngredient}", produces = MediaType.APPLICATION_JSON_VALUE)
	public IngredientDTO getPizzeriaById(@PathVariable Long idIngredient) {
		return ingredientServiceimpl.findById(idIngredient);
		}
	
	@GetMapping(value = "/ingredient")
	public List<IngredientDTO> getAllpizzeria() {
		return ingredientServiceimpl.findAll();
	}
	@DeleteMapping(value = "/ingredient/{idIngredient}")
	public void deletePizzeria(@PathVariable Long idIngredient) {
		ingredientServiceimpl.deleteIngredient(idIngredient);
	}
	
	@PutMapping(value = "/ingredient/{idIngredient}")
	public IngredientEntity updateIngredient(@RequestBody IngredientDTO ingredientDTO, @PathVariable Long idIngredient) {
		 return ingredientServiceimpl.upadteIngredient(ingredientDTO, idIngredient);
	}

}
