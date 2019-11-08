package com.thp.spring.projetlibre.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recette")
public class RecetteEntity extends MyEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -204655294467855302L;
	
	@EmbeddedId
	@Column(name = "id_recette")
	private RecetteId recetteId;
	@Column(name = "quantite")
	private double quantite;
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "idProduit", referencedColumnName = "id_produit", insertable = false, updatable = false)
	private ProduitEntity produitEntity;
	@ManyToOne
	@JoinColumn(name = "idIngredient", referencedColumnName = "id_ingredient", insertable = false, updatable = false)
	private IngredientEntity ingredientEntity;
	
	
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
	public ProduitEntity getProduitEntity() {
		return produitEntity;
	}
	public void setProduitEntity(ProduitEntity produitEntity) {
		this.produitEntity = produitEntity;
	}
	public IngredientEntity getIngredientEntity() {
		return ingredientEntity;
	}
	public void setIngredientEntity(IngredientEntity ingredientEntity) {
		this.ingredientEntity = ingredientEntity;
	}
	public RecetteEntity() {
		super();
	
	}
	@Override
	public String toString() {
		return "RecetteEntity [recetteId=" + recetteId + ", quantite=" + quantite + ", description=" + description
				+ ", produitEntity=" + produitEntity + ", ingredientEntity=" + ingredientEntity + "]";
	}
	public RecetteEntity(RecetteId recetteId, double quantite, String description, ProduitEntity produitEntity,
			IngredientEntity ingredientEntity) {
		super();
		this.recetteId = recetteId;
		this.quantite = quantite;
		this.description = description;
		this.produitEntity = produitEntity;
		this.ingredientEntity = ingredientEntity;
	}
	public RecetteEntity(RecetteId recetteId, double quantite, String description) {
		super();
		this.recetteId = recetteId;
		this.quantite = quantite;
		this.description = description;
	}
	
	

}
