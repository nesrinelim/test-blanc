package com.thp.spring.projetlibre.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="commande_produit")
public class CommandeProduit extends MyEntity implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	@Column(name = "commandeProduitId")
	private CommandeProduitId cdPdt;
	@ManyToOne
	@JoinColumn(name = "idProduit", referencedColumnName = "id_produit", insertable = false, updatable = false)
	private ProduitEntity produit;
	@ManyToOne
	@JoinColumn(name = "idCommande", referencedColumnName = "id", insertable = false, updatable = false)
	private CommandeEntity commande;
	@Column(name = "quantite")
	private double quantite;

	public CommandeProduit() {
		super();

	}

	
	public CommandeProduitId getCdPdt() {
		return cdPdt;
	}

	public void setCdPdt(CommandeProduitId cdPdt) {
		this.cdPdt = cdPdt;
	}

	
	public ProduitEntity getProduit() {
		return produit;
	}

	public void setProduit(ProduitEntity produit) {
		this.produit = produit;
	}

	
	public CommandeEntity getCommande() {
		return commande;
	}

	public void setCommande(CommandeEntity commande) {
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
		return "CommandeProduit [cdPdt=" + cdPdt + ", produit=" + produit + ", commande=" + commande + ", quantite="
				+ quantite + "]";
	}


	public CommandeProduit(CommandeProduitId cdPdt, ProduitEntity produit, CommandeEntity commande, double quantite) {
		super();
		this.cdPdt = cdPdt;
		this.produit = produit;
		this.commande = commande;
		this.quantite = quantite;
	}

	

}
