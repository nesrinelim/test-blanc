package com.thp.spring.projetlibre.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ingredient")
public class IngredientEntity extends MyEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_ingredient")
	private Long id;
	@Column(name = "nom")
	private String nom;
	@OneToMany(mappedBy = "ingredientEntity")
	@JsonBackReference
	private List<StockEntity> stockEntity;
	
	@OneToMany(mappedBy = "ingredientEntity")
	private List<RecetteEntity> recetteEntity;
	
	public List<StockEntity> getStockEntity() {
		return stockEntity;
		}


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


	public void setStockEntity(List<StockEntity> stockEntity) {
		this.stockEntity = stockEntity;
	}


	@Override
	public String toString() {
		return "IngredientEntity [id=" + id + ", nom=" + nom + ", stockEntity=" + stockEntity + "]";
	}


	public IngredientEntity(Long id, String nom, List<StockEntity> stockEntity) {
		super();
		this.id = id;
		this.nom = nom;
		this.stockEntity = stockEntity;
	}


	public IngredientEntity() {
		super();
	}


	public IngredientEntity(Long id, String nom, List<StockEntity> stockEntity, List<RecetteEntity> recetteEntity) {
		super();
		this.id = id;
		this.nom = nom;
		this.stockEntity = stockEntity;
		this.recetteEntity = recetteEntity;
	}


	public List<RecetteEntity> getRecetteEntity() {
		return recetteEntity;
	}


	public void setRecetteEntity(List<RecetteEntity> recetteEntity) {
		this.recetteEntity = recetteEntity;
	}



	
	
}


