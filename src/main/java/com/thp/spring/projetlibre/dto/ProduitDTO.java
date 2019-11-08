package com.thp.spring.projetlibre.dto;


import java.io.Serializable;

import com.thp.spring.projetlibre.entities.CarteEntity;
public class ProduitDTO extends MyDTO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6222345451861382955L;


	private Long id;
	private double tarif;
	private String nom;
	private String description;
	private String image;
	private CarteEntity carte;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTarif() {
		return tarif;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
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

	public ProduitDTO() {
		super();

	}

	public CarteEntity getCarte() {
		return carte;
	}

	public void setCarte(CarteEntity carte) {
		this.carte = carte;
	}

	public ProduitDTO(Long id, double tarif, String nom, String description, String image) {
		super();
		this.id = id;
		this.tarif = tarif;
		this.nom = nom;
		this.description = description;
		this.image = image;
	}

	@Override
	public String toString() {
		return "ProduitDTO [id=" + id + ", tarif=" + tarif + ", nom=" + nom + ", description=" + description
				+ ", image=" + image + "]";
	}

}
