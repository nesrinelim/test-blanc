package com.thp.spring.projetlibre.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.thp.spring.projetlibre.util.Etat;
import com.thp.spring.projetlibre.util.ModePaiement;
import com.thp.spring.projetlibre.util.ModeRetrait;

@Entity
@Table(name = "commande")

public class CommandeEntity extends MyEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8088789222101619953L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "date_commande")
	private Date dateCommande;
	@Column(name = "date_livraison")
	private Date dateLivraison;
	@Column(name = "tarif")
	private double tarif;
	@Column(name = "regle")
	private boolean regle;
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private Etat status;
	@Enumerated(EnumType.STRING)
	@Column(name = "retrait")
	private ModeRetrait retrait;
	@Enumerated(EnumType.STRING)
	@Column(name = "paiement")
	private ModePaiement paiement;

	@ManyToOne

	@JoinColumn(name = "utilisateur_id")
	private UtilisateurEntity utilisateur;

	@ManyToOne
	@JoinColumn(name = "pizza_id")
	private PizzeriaEntity pizza;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private UtilisateurEntity client;
	
	@ManyToOne
	@JoinColumn(name = "caissier_id")
	private UtilisateurEntity caissier;
	
	@ManyToOne
	@JoinColumn(name = "livreur_id")
	private UtilisateurEntity livreur;
	
	@ManyToOne
	@JoinColumn(name = "log_id")
	private UtilisateurEntity logistique;
	
	 @OneToMany(mappedBy = "commande")
	private Set<CommandeProduit> cdProduits;
	

	
	
	

	
	/* Constructor */

	public CommandeEntity() {
		super();

	}

	public CommandeEntity(Date dateCommande, Date dateLivraison, double tarif, boolean regle, Etat status,
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

	/* getters and setters */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Etat getStatus() {
		return status;
	}

	public void setStatus(Etat status) {
		this.status = status;
	}

	public UtilisateurEntity getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurEntity utilisateur) {
		this.utilisateur = utilisateur;
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

	public PizzeriaEntity getPizza() {
		return pizza;
	}

	public void setPizza(PizzeriaEntity pizza) {
		this.pizza = pizza;
	}

	public UtilisateurEntity getClient() {
		return client;
	}

	public void setClient(UtilisateurEntity client) {
		this.client = client;
	}

	public UtilisateurEntity getCaissier() {
		return caissier;
	}

	public void setCaissier(UtilisateurEntity caissier) {
		this.caissier = caissier;
	}

	public UtilisateurEntity getLivreur() {
		return livreur;
	}

	public void setLivreur(UtilisateurEntity livreur) {
		this.livreur = livreur;
	}

	public UtilisateurEntity getLogistique() {
		return logistique;
	}

	public void setLogistique(UtilisateurEntity logistique) {
		this.logistique = logistique;
	}

	public Set<CommandeProduit> getCdProduits() {
		return cdProduits;
	}

	public void setCdProduits(Set<CommandeProduit> cdProduits) {
		this.cdProduits = cdProduits;
	}

	


	

}
