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

import com.thp.spring.projetlibre.dto.PizzeriaDTO;
import com.thp.spring.projetlibre.entities.PizzeriaEntity;
import com.thp.spring.projetlibre.service.PizzeriaService;

@RestController(value = "/pizzeria")
@CrossOrigin("*")
public class PizzeriaController {
	@Autowired
	PizzeriaService pizzeriaServiceimpl;

	@PostMapping(value = "/pizzeria")
	public void addPizzeria(@RequestBody PizzeriaDTO pizzeriaDTO) {
		pizzeriaServiceimpl.addPizzeria(pizzeriaDTO);
	}

	
	@GetMapping(value = "/pizzeria/{idPizzeria}")
	public PizzeriaDTO getPizzeriaById(@PathVariable Long idPizzeria) {
		return pizzeriaServiceimpl.findById(idPizzeria);
		}
	
	@GetMapping(value = "/pizzeria")
	public List<PizzeriaDTO> getAllpizzeria() {
		return pizzeriaServiceimpl.findAll();
	}
	@DeleteMapping(value = "/pizzeria/{idPizzeria}")
	public void deletePizzeria(@PathVariable Long idPizzeria) {
		pizzeriaServiceimpl.deletePizzeria(idPizzeria);
	}
	
	@PutMapping(value = "/pizzeria/{idPizzeria}")
	public PizzeriaEntity updatePizzeria(@RequestBody PizzeriaDTO pizzeriaDTO, @PathVariable Long idPizzeria) {
		 return pizzeriaServiceimpl.upadtePizzeria(pizzeriaDTO, idPizzeria);
	}
}

