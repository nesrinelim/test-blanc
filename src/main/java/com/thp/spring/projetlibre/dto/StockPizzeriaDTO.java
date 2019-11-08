package com.thp.spring.projetlibre.dto;

import java.io.Serializable;

public class StockPizzeriaDTO extends MyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1933261849347492064L;
	private Double qtte;
	private String nom;

	public Double getQtte() {
		return qtte;
	}

	public void setQtte(Double qtte) {
		this.qtte = qtte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public StockPizzeriaDTO(Double qtte, String nom) {
		super();
		this.qtte = qtte;
		this.nom = nom;
	}

	public StockPizzeriaDTO() {
		super();
	}

	@Override
	public String toString() {
		return "StockPizzeriaDTO [qtte=" + qtte + ", nom=" + nom + "]";
	}

}
