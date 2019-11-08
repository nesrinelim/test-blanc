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

import com.thp.spring.projetlibre.dto.CommandeDTO;
import com.thp.spring.projetlibre.service.CommandeService;

@RestController(value = "/commande")
@CrossOrigin("*")
public class CommandeController {

	@Autowired
	CommandeService cmdService;

	@GetMapping(value = "/commande", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CommandeDTO> getAllCommande() {
		return cmdService.findAll();
	}

	@GetMapping(value = "/commande/{cmdId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CommandeDTO getCommandeById(@PathVariable Long cmdId) {
		return cmdService.findById(cmdId);
	}

	@DeleteMapping(value = "/commande/{cmdId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCommande(@PathVariable Long cmdId) {
		cmdService.deleteCommande(cmdId);
	}

	@PostMapping(value = "/commande", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createCommande(@RequestBody CommandeDTO cmdDTO) {
		cmdService.addCommande(cmdDTO);
	}

	@PutMapping(value = "/commande", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateCommande(@RequestBody CommandeDTO cmdDTO) {
		cmdService.addCommande(cmdDTO);
	}

	/*
	 * @GetMapping(value = "/commandeByStatus", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public CommandeDTO
	 * getCommandeByStatus(@RequestParam Etat status) { return
	 * cmdService.findByStatus(status);}
	 */
	
	/*
	 * cete méthode est utilisée pour qu'un client peut consulter ses commandes et
	 * ses factures elle prend en paramètre l'id de l'utilisateur et elle retourne
	 * la liste des commandes
	 */

	@GetMapping(value = "/commandeUser/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CommandeDTO> getCommandeByUtilisateur(@PathVariable Long userId) {
		System.out.println("idUSER" + userId);
		return cmdService.findCommandeByUtilisateur(userId);
	}

}
