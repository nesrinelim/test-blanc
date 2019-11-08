package com.thp.spring.projetlibre.dto;

import java.io.Serializable;
import java.util.Set;

public class IngredientDTO extends MyDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2813366992905955677L;
	private int id;
	private String nom;
	private Set<PizzeriaDTO> ingredientPizzerias ;
	private Set<ProduitDTO> ingredientProduits ;
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
	public Set<PizzeriaDTO> getIngredientPizzerias() {
		return ingredientPizzerias;
	}
	public void setIngredientPizzerias(Set<PizzeriaDTO> ingredientPizzerias) {
		this.ingredientPizzerias = ingredientPizzerias;
	}
	public Set<ProduitDTO> getIngredientProduits() {
		return ingredientProduits;
	}
	public void setIngredientProduits(Set<ProduitDTO> ingredientProduits) {
		this.ingredientProduits = ingredientProduits;
	}
	public IngredientDTO(int id, String nom, Set<PizzeriaDTO> ingredientPizzerias, Set<ProduitDTO> ingredientProduits) {
		super();
		this.id = id;
		this.nom = nom;
		this.ingredientPizzerias = ingredientPizzerias;
		this.ingredientProduits = ingredientProduits;
	}
	public IngredientDTO(String nom, Set<PizzeriaDTO> ingredientPizzerias, Set<ProduitDTO> ingredientProduits) {
		super();
		this.nom = nom;
		this.ingredientPizzerias = ingredientPizzerias;
		this.ingredientProduits = ingredientProduits;
	}
	public IngredientDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IngredientDTO [id=" + id + ", nom=" + nom + ", ingredientPizzerias=" + ingredientPizzerias
				+ ", ingredientProduits=" + ingredientProduits + "]";
	}
	
	
	
	
	
	
	
	
}
