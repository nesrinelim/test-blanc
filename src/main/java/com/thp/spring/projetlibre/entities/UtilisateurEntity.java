package com.thp.spring.projetlibre.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class UtilisateurEntity extends MyEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3715601421770364063L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_utilisateur")
	private Long id;
	@Column(name = "pseudo", unique = true)
	private String pseudo;
	@Column(name = "mot_de_passe")
	private String motDePasse;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "code_postal")
	private String codePostal;
	@Column(name = "ville")
	private String ville;
	@Column(name = "mail")
	private String mail;
	@Column(name = "tel")
	private String tel;

	@ManyToOne
	@JoinColumn(name = "role_id")
	private RoleEntity role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	public UtilisateurEntity(Long id, String pseudo, String motDePasse, String nom, String prenom, String adresse,
			String codePostal, String ville, String mail, String tel, RoleEntity role) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.mail = mail;
		this.tel = tel;
		this.role = role;
	}

	public UtilisateurEntity(String pseudo, String motDePasse, String nom, String prenom, String adresse,
			String codePostal, String ville, String mail, String tel, RoleEntity role) {
		super();
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.mail = mail;
		this.tel = tel;
		this.role = role;
	}

	public UtilisateurEntity(String pseudo, String motDePasse) {
		super();
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
	}

	public UtilisateurEntity() {
		super();
	}

	@Override
	public String toString() {
		return "UtilisateurEntity [id=" + id + ", pseudo=" + pseudo + ", motDePasse=" + motDePasse + ", nom=" + nom
				+ ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville
				+ ", mail=" + mail + ", tel=" + tel + ", role=" + role + ", commandes=" + "]";
	}

}
