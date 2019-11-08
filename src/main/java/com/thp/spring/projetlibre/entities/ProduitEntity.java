package com.thp.spring.projetlibre.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class ProduitEntity extends MyEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 937281005845994070L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_produit")
	private Long id;
	@Column(name = "tarif")
	private double tarif;
	@Column(name = "nom")
	private String nom;
	@Column(name = "description")
	private String description;
	@Column(name ="image")
	private String image;
	
	 @ManyToOne 
	 @JoinColumn(name = "carte_id")
	 private CarteEntity carte;
	 
	 @OneToMany(mappedBy = "produit")
	private Set<CommandeProduit> cdProduits;
	 

	@ManyToMany
	private Set<PizzeriaEntity> pizzerias = new HashSet<>();

	@OneToMany(mappedBy = "produitEntity")
	private List<RecetteEntity> recetteEntity;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public Set<PizzeriaEntity> getPizzerias() {
		return pizzerias;
	}

	public void setPizzerias(Set<PizzeriaEntity> pizzerias) {
		this.pizzerias = pizzerias;
	}

	
	public CarteEntity getCarte() {
		return carte;
	}

	public void setCarte(CarteEntity carte) {
		this.carte = carte;
	}

	public ProduitEntity(Long id, double tarif, String nom, String description, String image,
			Set<PizzeriaEntity> pizzerias) {
		super();
		this.id = id;
		this.tarif = tarif;
		this.nom = nom;
		this.description = description;
		this.image = image;
		this.pizzerias = pizzerias;
	}


	public Set<CommandeProduit> getCdProduits() {
		return cdProduits;
	}

	public void setCdProduits(Set<CommandeProduit> cdProduits) {
		this.cdProduits = cdProduits;
	}

	@Override
	public String toString() {
		return "ProduitEntity [id=" + id + ", tarif=" + tarif + ", nom=" + nom + ", description=" + description
				+ ", image=" + image + ", pizzerias=" + pizzerias + "]";
	}

	public ProduitEntity() {
		super();

	}

	public ProduitEntity(Long id, double tarif, String nom, String description, String image, CarteEntity carte,
			Set<CommandeProduit> cdProduits, Set<PizzeriaEntity> pizzerias, List<RecetteEntity> recetteEntity) {
		super();
		this.id = id;
		this.tarif = tarif;
		this.nom = nom;
		this.description = description;
		this.image = image;
		this.carte = carte;
		this.cdProduits = cdProduits;
		this.pizzerias = pizzerias;
		this.recetteEntity = recetteEntity;
	}

	public List<RecetteEntity> getRecetteEntity() {
		return recetteEntity;
	}

	public void setRecetteEntity(List<RecetteEntity> recetteEntity) {
		this.recetteEntity = recetteEntity;
	}
	 
	
	

}
