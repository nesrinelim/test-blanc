package com.thp.spring.projetlibre.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StockId extends MyEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7260064542628580973L;
	private long idPizzeria;
	private long idIngredient;
	public long getIdPizzeria() {
		return idPizzeria;
	}
	public void setIdPizzeria(long idPizzeria) {
		this.idPizzeria = idPizzeria;
	}
	public long getIdIngredient() {
		return idIngredient;
	}
	public void setIdIngredient(long idIngredient) {
		this.idIngredient = idIngredient;
	}
	public StockId(long idPizzeria, long idIngredient) {
		super();
		this.idPizzeria = idPizzeria;
		this.idIngredient = idIngredient;
	}
	public StockId() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StockId [idPizzeria=" + idPizzeria + ", idIngredient=" + idIngredient + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idIngredient ^ (idIngredient >>> 32));
		result = prime * result + (int) (idPizzeria ^ (idPizzeria >>> 32));
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
		StockId other = (StockId) obj;
		if (idIngredient != other.idIngredient)
			return false;
		if (idPizzeria != other.idPizzeria)
			return false;
		return true;
	}
	
	

	
}
