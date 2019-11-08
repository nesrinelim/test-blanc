package com.thp.spring.projetlibre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.projetlibre.dto.ProduitDTO;
import com.thp.spring.projetlibre.dto.UtilisateurDTO;
import com.thp.spring.projetlibre.entities.RoleEntity;
import com.thp.spring.projetlibre.entities.UtilisateurEntity;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.UtilisateurRepository;
import com.thp.spring.projetlibre.service.UtilisateurService;

@RestController
@CrossOrigin("*")
public class UtilisateurController {

	@Autowired
	UtilisateurService utilisateurService;

	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UtilisateurRepository utilisateurRepository;

	@GetMapping(value = "/users")
	@Secured("ROLE_ADMIN")
	public List<UtilisateurDTO> getAllUsers() {
		return utilisateurService.findAll();
	}

	@GetMapping(value = "/user")
	public UtilisateurDTO getUser(@RequestParam Long id) {
		return utilisateurService.findById(id);
	}

	@PostMapping(value = "/user")
	public UtilisateurDTO addUser(@RequestBody UtilisateurDTO utilisateurDTO) {
		System.out.println(utilisateurDTO);
		UtilisateurDTO user = new UtilisateurDTO();
		RoleEntity role = new RoleEntity();
		role.setId(2L);
		user.setAdresse(utilisateurDTO.getAdresse());
		user.setCodePostal(utilisateurDTO.getCodePostal());
		user.setMail(utilisateurDTO.getMail());
		user.setMotDePasse(passwordEncoder.encode(utilisateurDTO.getMotDePasse()));
		user.setNom(utilisateurDTO.getNom());
		user.setPrenom(utilisateurDTO.getPrenom());
		user.setPseudo(utilisateurDTO.getPseudo());
		user.setRole(role);
		user.setTel(utilisateurDTO.getTel());
		user.setVille(utilisateurDTO.getVille());
		System.out.println(user);
		System.out.println(utilisateurDTO);
		return utilisateurService.addUtilisateur(user);
	}

	/*
	 * cette méthode est utilisée pour qu'un utlisateur connecté peut récupérer ses
	 * données et commandes elle prend comme paramètre le pseudo d'un utilisateur
	 */

	@GetMapping(value = "/userByPseudo/{pseudo}")
	public UtilisateurDTO getProduitByPseudo(@PathVariable String pseudo) {
		System.out.println(pseudo);
		System.out.println(utilisateurService.findByPseudo(pseudo));
		return utilisateurService.findByPseudo(pseudo);
	}

	@PutMapping(value = "user/{id}")
	public UtilisateurDTO updateUser(@PathVariable("id")Long idUser,@RequestBody UtilisateurDTO utilisateurDTO) {
		UtilisateurDTO currentUser = utilisateurService.findById(idUser);
		
		currentUser.setAdresse(utilisateurDTO.getAdresse());
		currentUser.setCodePostal(utilisateurDTO.getCodePostal());
		currentUser.setMail(utilisateurDTO.getMail());
		currentUser.setMotDePasse(passwordEncoder.encode(utilisateurDTO.getMotDePasse()));
		currentUser.setNom(utilisateurDTO.getNom());
		currentUser.setPrenom(utilisateurDTO.getPrenom());
		currentUser.setPseudo(utilisateurDTO.getPseudo());
		currentUser.setRole(currentUser.getRole());
		currentUser.setTel(utilisateurDTO.getTel());
		currentUser.setVille(utilisateurDTO.getVille());
	return utilisateurService.addUtilisateur(currentUser);
	}
}
