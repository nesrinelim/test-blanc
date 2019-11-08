package com.thp.spring.projetlibre.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class RecetteId extends MyEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2505997980279422059L;
	private Long idProduit;
	private Long idIngredient;
	
	
	public Long  getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long  idProduit) {
		this.idProduit = idProduit;
	}
	public long  getIdIngredient() {
		return idIngredient;
	}
	public void setIdIngredient(Long  idIngredient) {
		this.idIngredient = idIngredient;
	}
	public RecetteId(Long idProduit, Long idIngredient) {
		super();
		this.idProduit = idProduit;
		this.idIngredient = idIngredient;
	}
	public RecetteId() {
		super();
		
	}
	@Override
	public String toString() {
		return "RecetteId [idProduit=" + idProduit + ", idIngredient=" + idIngredient + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idIngredient ^ (idIngredient >>> 32));
		result = prime * result + (int) (idProduit ^ (idProduit >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecetteId other = (RecetteId) obj;
		if (idIngredient != other.idIngredient)
			return false;
		if (idProduit != other.idProduit)
			return false;
		return true;
	}
	
	
	

}
