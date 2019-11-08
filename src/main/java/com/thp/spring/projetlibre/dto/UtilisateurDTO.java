package com.thp.spring.projetlibre.dto;

import java.util.Set;

import javax.persistence.OneToMany;

import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.entities.RoleEntity;

public class UtilisateurDTO extends MyDTO {

	private Long id;
	private String pseudo;
	private String motDePasse;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String mail;
	private String tel;
	private RoleEntity role;
	private Set<CommandeEntity> commandes;
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

	public UtilisateurDTO(Long id, String pseudo, String motDePasse, String nom, String prenom, String adresse,
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

	public UtilisateurDTO(String pseudo, String motDePasse, String nom, String prenom, String adresse,
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

	public UtilisateurDTO() {
		super();
	}

	public Set<CommandeEntity> getCommandes() {
		return commandes;
	}

	public void setCommandes(Set<CommandeEntity> commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "UtilisateurDTO [id=" + id + ", pseudo=" + pseudo + ", motDePasse=" + motDePasse + ", nom=" + nom
				+ ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville
				+ ", mail=" + mail + ", tel=" + tel + ", role=" + role + ", commandes=" + commandes + "]";
	}

	public UtilisateurDTO(Long id, String pseudo, String motDePasse, String nom, String prenom, String adresse,
			String codePostal, String ville, String mail, String tel, RoleEntity role, Set<CommandeEntity> commandes) {
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
		this.commandes = commandes;
	}


}
