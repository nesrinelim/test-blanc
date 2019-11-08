INSERT INTO utilisateur(
	id_utilisateur, adresse, code_postal, mail, mot_de_passe, nom, prenom, pseudo, tel, ville)
	VALUES (1, 'tunis', '2100', 'test@talan.com', 'mot de passe', 'moez', 'khediri', 'moez', '25310694', 'tunis');

	
	
	INSERT INTO commande(
	id, date_commande, date_livraison, paiement, regle, retrait, status, tarif, utilisateur_id, pizza_id)
	VALUES (1, null,null, 'carte_bleu',true, 'retrait', 'panier', 200, 1, null);
	
	INSERT INTO produit(
	id_produit, description, nom, tarif)
	VALUES (1, 'a', 'b', 1.5);

	INSERT INTO public.pizzeria(
	id_pizzeria, adresse, nom)
	VALUES (1, 'AKREM', 'ZITOUNI');
	
	

