package com.thp.spring.projetlibre.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.thp.spring.projetlibre.entities.ProduitEntity;

public class CarteDTO extends MyDTO{
	
	private Long id;
	
	private String nom;

	private String description;
	
 
    private Set<ProduitEntity> produits = new HashSet<>();


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Set<ProduitEntity> getProduits() {
		return produits;
	}


	public void setProduits(Set<ProduitEntity> produits) {
		this.produits = produits;
	}


	public CarteDTO(Long id, String nom, String description, Set<ProduitEntity> produits) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.produits = produits;
	}


	public CarteDTO() {
		super();
	
	}


	@Override
	public String toString() {
		return "CarteDTO [id=" + id + ", nom=" + nom + ", description=" + description + ", produits=" + produits + "]";
	}
    
    

}
