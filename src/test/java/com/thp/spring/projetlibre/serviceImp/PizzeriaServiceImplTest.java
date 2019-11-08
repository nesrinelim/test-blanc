package com.thp.spring.projetlibre.serviceImp;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.PizzeriaDTO;
import com.thp.spring.projetlibre.service.PizzeriaService;

@Transactional
@Rollback(true)
@SpringBootTest
@ActiveProfiles("test")
class PizzeriaServiceImplTest {

	@Autowired
	PizzeriaService pizzeriaService;
	
	@Test
	void testFindById() {
		PizzeriaDTO pizzeria = pizzeriaService.findById((long) 1);
		assertEquals("ZITOUNI", pizzeria.getNom());	}	

	@Test
	void testFindAll() {
		List<PizzeriaDTO> PizzeriaList = pizzeriaService.findAll();
		assertEquals(3, PizzeriaList.size());
	}

//	@Test
//	void testDeletePizzeria() {
//		PizzeriaDTO pizzeria = pizzeriaService.deletePizzeria(1);
//		assertNull(pizzeriaService.findById((long) 1));
//	}
//
//	@Test
//	void testAddPizzeria() {
//		PizzeriaDTO pizzeriaDTO = new PizzeriaDTO();
//		pizzeriaDTO.setNom("pizza");
//		pizzeriaDTO.setAdresse("tunis");
//		pizzeriaDTO.setId(4);
//		assertEquals(4, pizzeriaService.findById(id_pizzeria));
//	}
//
//	@Test
//	void testUpadtePizzeria() {
//		int id = 3;
//		PizzeriaDTO pizzeriaDTO = new PizzeriaDTO();
//		pizzeriaDTO.UpadtePizzeria(id, pizzeriaDTOExpected);
//
//		assertEquals(searchDTOExpected, searchService.findSearchById(id));
//
//	}

}
