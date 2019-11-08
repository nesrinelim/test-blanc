package com.thp.spring.projetlibre.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity extends MyEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4351077751770937670L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_role")
	private Long id;
	@Column(name = "nom")
	private String nom;

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

	public RoleEntity() {
		super();
	}

	public RoleEntity(Long id, String nom, UtilisateurEntity utilisateur) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public RoleEntity(String nom, UtilisateurEntity utilisateur) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", nom=" + nom + "]";
	}

}
