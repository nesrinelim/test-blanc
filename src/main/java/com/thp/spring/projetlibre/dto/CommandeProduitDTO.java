package com.thp.spring.projetlibre.dto;

import java.io.Serializable;

import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.entities.CommandeProduitId;
import com.thp.spring.projetlibre.entities.ProduitEntity;

public class CommandeProduitDTO extends MyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8118216703546024776L;

	private Long id;
	private CommandeProduitId cdPdt;
	private ProduitDTO produit;
	private CommandeDTO commande;
	private double quantite;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CommandeProduitId getCdPdt() {
		return cdPdt;
	}
	public void setCdPdt(CommandeProduitId cdPdt) {
		this.cdPdt = cdPdt;
	}
	public ProduitDTO getProduit() {
		return produit;
	}
	public void setProduit(ProduitDTO produit) {
		this.produit = produit;
	}
	public CommandeDTO getCommande() {
		return commande;
	}
	public void setCommande(CommandeDTO commande) {
		this.commande = commande;
	}
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "CommandeProduitDTO [id=" + id + ", cdPdt=" + cdPdt + ", produit=" + produit + ", commande=" + commande
				+ ", quantite=" + quantite + "]";
	}
	public CommandeProduitDTO(Long id, CommandeProduitId cdPdt, ProduitDTO produit, CommandeDTO commande,
			double quantite) {
		super();
		this.id = id;
		this.cdPdt = cdPdt;
		this.produit = produit;
		this.commande = commande;
		this.quantite = quantite;
	}
	public CommandeProduitDTO() {
		super();
	}

	
}
