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

import com.thp.spring.projetlibre.dto.CarteDTO;
import com.thp.spring.projetlibre.service.CarteService;

@RestController(value="/carte")
@CrossOrigin ("*")
public class CarteController {
	
	@Autowired
	CarteService carteService;
	
	
	@GetMapping(value="/carte")
	public List<CarteDTO> getAllCarte(){
		return carteService.findAll();		
	}
	
	@PostMapping(value = "/carte", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createCarte(@RequestBody CarteDTO carteDTO) {
		carteService.addCarte(carteDTO);
	}
	
	@DeleteMapping(value = "/carte/{carteId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCarte(@PathVariable Long carteId) {
		carteService.deleteCarte(carteId);
	}
	
	@GetMapping(value = "/carte/{carteId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CarteDTO getCarteById(@PathVariable Long carteId) {
		return carteService.findById(carteId);
	}
	
	@PutMapping(value = "/carte", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateCarte(@RequestBody CarteDTO carteDTO) {
		carteService.addCarte(carteDTO);
	}
}
