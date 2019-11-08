package com.thp.spring.projetlibre.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "carte")
public class CarteEntity extends MyEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6659508119047348730L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_carte")
	private Long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "description")
	private String description;
	
    @OneToMany
	@JoinColumn(name = "produits")
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

	public CarteEntity(Long id, String nom, String description, Set<ProduitEntity> produits) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.produits = produits;
	}

	public CarteEntity() {
		super();
		
	}

	@Override
	public String toString() {
		return "CarteEntity [id=" + id + ", nom=" + nom + ", description=" + description + ", produits=" + produits
				+ "]";
	}
   
	
	
}
