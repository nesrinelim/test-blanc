package com.thp.spring.projetlibre.dto;

public class RoleDTO extends MyDTO{

	private Long id;
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
	public RoleDTO(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public RoleDTO(String nom) {
		super();
		this.nom = nom;
	}
	public RoleDTO() {
		super();
	}
	@Override
	public String toString() {
		return "RoleDTO [id=" + id + ", nom=" + nom + "]";
	}
	
	
}
