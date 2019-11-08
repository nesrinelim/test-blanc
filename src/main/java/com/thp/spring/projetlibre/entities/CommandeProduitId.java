package com.thp.spring.projetlibre.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CommandeProduitId extends MyEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Long idProduit;
	private Long idCommande;
	
	public CommandeProduitId() {
		super();
		
	}
	public CommandeProduitId(Long idProduit, Long idCommande) {
		super();
		this.idProduit = idProduit;
		this.idCommande = idCommande;
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	@Override
	public String toString() {
		return "CommandeProduitId [idProduit=" + idProduit + ", idCommande=" + idCommande + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCommande == null) ? 0 : idCommande.hashCode());
		result = prime * result + ((idProduit == null) ? 0 : idProduit.hashCode());
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
		CommandeProduitId other = (CommandeProduitId) obj;
		if (idCommande == null) {
			if (other.idCommande != null)
				return false;
		} else if (!idCommande.equals(other.idCommande))
			return false;
		if (idProduit == null) {
			if (other.idProduit != null)
				return false;
		} else if (!idProduit.equals(other.idProduit))
			return false;
		return true;
	}
	
	
	
}
