package com.thp.spring.projetlibre.dto;

import java.io.Serializable;
import java.util.List;

public class PizzeriaDTO extends MyDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2813366992905955677L;
	private int id;
	private String nom;
	private String adresse;
	private List<CommandeDTO> commandesPizzeria;
	private List<UtilisateurDTO> employes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public List<CommandeDTO> getCommandesPizzeria() {
		return commandesPizzeria;
	}
	public void setCommandesPizzeria(List<CommandeDTO> commandesPizzeria) {
		this.commandesPizzeria = commandesPizzeria;
	}
	public List<UtilisateurDTO> getEmployes() {
		return employes;
	}
	public void setEmployes(List<UtilisateurDTO> employes) {
		this.employes = employes;
	}
	@Override
	public String toString() {
		return "PizzeriaDTO [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", commandesPizzeria="
				+ commandesPizzeria + ", employes=" + employes + "]";
	}
	public PizzeriaDTO(int id, String nom, String adresse, List<CommandeDTO> commandesPizzeria,
			List<UtilisateurDTO> employes) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.commandesPizzeria = commandesPizzeria;
		this.employes = employes;
	}
	public PizzeriaDTO() {
		super();
	}
	
	

}
