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
@Table(name = "pizzeria")
public class PizzeriaEntity extends MyEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3715601421770364063L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pizzeria")
	private Long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "adresse")
	private String adresse;
	@OneToMany(mappedBy = "pizzeriaEntity")
	private List<StockEntity> stockEntity;
	@JsonBackReference
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setStockEntity(List<StockEntity> stockEntity) {
		this.stockEntity = stockEntity;
	}

	@Override
	public String toString() {
		return "PizzeriaEntity [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", stockEntity=" + stockEntity
				+ "]";
	}

	public PizzeriaEntity(Long id, String nom, String adresse, List<StockEntity> stockEntity) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.stockEntity = stockEntity;
	}

	public PizzeriaEntity() {
		super();
	}
	
}