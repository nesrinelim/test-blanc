package com.thp.spring.projetlibre.dto;

import com.thp.spring.projetlibre.entities.RecetteId;

public class RecetteDTO extends MyDTO{
	
	private RecetteId recetteId;

	private double quantite;

	private String description;
	
	private ProduitDTO produitDTO;
	
	private IngredientDTO ingredientDTO;

	public RecetteDTO() {
		super();
	
	}

	public RecetteId getRecetteId() {
		return recetteId;
	}

	public void setRecetteId(RecetteId recetteId) {
		this.recetteId = recetteId;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProduitDTO getProduit() {
		return produitDTO;
	}

	public void setProduit(ProduitDTO produitDTO) {
		this.produitDTO = produitDTO;
	}

	public IngredientDTO getIngredientDTO() {
		return ingredientDTO;
	}

	public void setIngredientDTO(IngredientDTO ingredientDTO) {
		this.ingredientDTO = ingredientDTO;
	}

	public RecetteDTO(RecetteId recetteId, double quantite, String description, ProduitDTO produitDTO,
			IngredientDTO ingredientDTO) {
		super();
		this.recetteId = recetteId;
		this.quantite = quantite;
		this.description = description;
		this.produitDTO = produitDTO;
		this.ingredientDTO = ingredientDTO;
	}

	@Override
	public String toString() {
		return "RecetteDTO [recetteId=" + recetteId + ", quantite=" + quantite + ", description=" + description
				+ ", produitDTO=" + produitDTO + ", ingredientDTO=" + ingredientDTO + "]";
	}


	
	
	

}
