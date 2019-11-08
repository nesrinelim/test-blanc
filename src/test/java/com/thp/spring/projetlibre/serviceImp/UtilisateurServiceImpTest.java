
package com.thp.spring.projetlibre.serviceImp;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.UtilisateurDTO;
import com.thp.spring.projetlibre.service.UtilisateurService;


@Transactional
@Rollback(true)
@SpringBootTest
@ActiveProfiles("test")
class UtilisateurServiceImpTest {

	@Autowired
	UtilisateurService utilisateurService;
	
	@Test
	void testFindById() {
		UtilisateurDTO utilisateur = utilisateurService.findById( 1L);
		assertEquals("moez", utilisateur.getNom());	
		}

	@Test
	void testFindByPseudo() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteUtilisateur() {
		fail("Not yet implemented");
	}

	@Test
	void testAddUtilisateur() {
		fail("Not yet implemented");
	}

}

