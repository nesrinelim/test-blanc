package com.thp.spring.projetlibre.serviceImp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.CommandeDTO;
import com.thp.spring.projetlibre.service.CommandeService;


/**
 * @author abouabid
 *
 */

@Transactional
@Rollback(true)
@SpringBootTest
@ActiveProfiles("test")
class CommandeServiceImplTest {
	
	@Autowired
	CommandeService commandeService;
	
	String date = "2014-01-28";
	
	@Test
	void testFindById() {
		CommandeDTO commande = commandeService.findById(1L);
		assertEquals(true, commande.isRegle());
	}

	@Test
	void testFindAll() {
		List<CommandeDTO> commandes = commandeService.findAll();
		assertEquals(1, commandes.size());
	}

	@Test
	void testDeleteCommande() {
		Long id = 1L;
		commandeService.deleteCommande(1L);
	}

	@Test
	void testAddCommande() {
		String date = "2014-01-28";

		Date utilDate = null;
		try {
			utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

		CommandeDTO cmd = new CommandeDTO(sqlDate, sqlDate, 200, true);
		commandeService.addCommande(cmd);
		assertNotNull(commandeService.findById(2L));
	}
	

//	@Test
//	void testFindCommandeByUtilisateur() {
//		CommandeDTO commande = commandeService.findCommandeByUtilisateur(1L);
//		assertEquals("carte_bleu", commande.getPaiement());		}


}
