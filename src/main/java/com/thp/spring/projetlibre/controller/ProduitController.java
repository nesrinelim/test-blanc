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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.projetlibre.dto.ProduitDTO;
import com.thp.spring.projetlibre.service.ProduitService;

@RestController (value = "/produit")
@CrossOrigin ("*")
public class ProduitController {
	
	@Autowired
	ProduitService pdtService;
	
	
	@GetMapping(value = "/produit", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProduitDTO> getAllProduit() {
		return pdtService.findAll();
	}

	@GetMapping(value = "/produit/{pdtId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProduitDTO getProduitById(@PathVariable Long pdtId) {
	  return pdtService.findById(pdtId);
	}
	
	@DeleteMapping(value = "/produit/{pdtId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void  deleteProduitById(@PathVariable Long pdtId) {
		pdtService.deleteProduit(pdtId);	
	}
	
	@PostMapping(value = "/produit", produces = MediaType.APPLICATION_JSON_VALUE)
	public void addProduit(@RequestBody ProduitDTO pDTO) {
		pdtService.addProduit(pDTO);
	}
	
	@PutMapping(value = "/produit", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateProduit(@RequestBody ProduitDTO pDTO) {
		pdtService.addProduit(pDTO);
	}
	
	@GetMapping(value = "/produitByNom", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProduitDTO getProduitByNom(@RequestParam String nom) {
		return pdtService.findByNom(nom);}

	
}
