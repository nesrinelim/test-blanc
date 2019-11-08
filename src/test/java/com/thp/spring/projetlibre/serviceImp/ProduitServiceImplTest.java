/**
 * 
 */
package com.thp.spring.projetlibre.serviceImp;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.ProduitDTO;
import com.thp.spring.projetlibre.service.ProduitService;

/**
 * @author abouabid
 *
 */

@Transactional
@Rollback(true)
@SpringBootTest
@ActiveProfiles("test")
class ProduitServiceImplTest {

	/**
	 * Test method for {@link com.thp.spring.projetlibre.serviceImp.ProduitServiceImpl#findById(java.lang.Long)}.
	 */
	@Autowired
	ProduitService produitservice;
	
	@Test
	void testFindById() {
		ProduitDTO pdt = produitservice.findById(1L);
		assertEquals("b", pdt.getNom());	
	}

	/**
	 * Test method for {@link com.thp.spring.projetlibre.serviceImp.ProduitServiceImpl#findByNom(java.lang.String)}.
	 */
	@Test
	void testFindByNom() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.thp.spring.projetlibre.serviceImp.ProduitServiceImpl#findAll()}.
	 */
	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.thp.spring.projetlibre.serviceImp.ProduitServiceImpl#deleteProduit(java.lang.Long)}.
	 */
	@Test
	void testDeleteProduit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.thp.spring.projetlibre.serviceImp.ProduitServiceImpl#addProduit(com.thp.spring.projetlibre.dto.ProduitDTO)}.
	 */
	@Test
	void testAddProduit() {
		fail("Not yet implemented");
	}

}
