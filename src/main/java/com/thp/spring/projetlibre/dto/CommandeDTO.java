package com.thp.spring.projetlibre.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.entities.PizzeriaEntity;
import com.thp.spring.projetlibre.entities.ProduitEntity;
import com.thp.spring.projetlibre.entities.UtilisateurEntity;
import com.thp.spring.projetlibre.util.Etat;
import com.thp.spring.projetlibre.util.ModePaiement;
import com.thp.spring.projetlibre.util.ModeRetrait;

public class CommandeDTO extends MyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -978645973814363692L;

	private Date dateCommande;

	public CommandeDTO() {
		super();

	}


	private Long id;

	private Date dateLivraison;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	private double tarif;

	private boolean regle;

	private Etat status;

	private ModeRetrait retrait;

	private ModePaiement paiement;

	private UtilisateurEntity utilisateur;

	private UtilisateurEntity client;
	private UtilisateurEntity caissier;
	private UtilisateurEntity livreur;
	private UtilisateurEntity logistique;
	private Set<ProduitEntity> produits = new HashSet<>();
	private Set<CommandeEntity> commandes = new HashSet<>();
	private Set<PizzeriaEntity> pizzerias = new HashSet<>();

	public Etat getStatus() {
		return status;
	}

	public void setStatus(Etat status) {
		this.status = status;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public boolean isRegle() {
		return regle;
	}

	public void setRegle(boolean regle) {
		this.regle = regle;
	}

	public ModeRetrait getRetrait() {
		return retrait;
	}

	public void setRetrait(ModeRetrait retrait) {
		this.retrait = retrait;
	}

	public ModePaiement getPaiement() {
		return paiement;
	}

	public void setPaiement(ModePaiement paiement) {
		this.paiement = paiement;
	}

	public UtilisateurEntity getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurEntity utilisateur) {
		this.utilisateur = utilisateur;
	}

	public CommandeDTO(Date dateCommande, Date dateLivraison, double tarif, boolean regle, Etat status,
			ModeRetrait retrait, ModePaiement paiement, UtilisateurEntity utilisateur) {
		super();
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.tarif = tarif;
		this.regle = regle;
		this.status = status;
		this.retrait = retrait;
		this.paiement = paiement;
		this.utilisateur = utilisateur;
	}

	public CommandeDTO(Date dateCommande, Date dateLivraison, double tarif, boolean regle) {
		super();
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.tarif = tarif;
		this.regle = regle;
	}

}
