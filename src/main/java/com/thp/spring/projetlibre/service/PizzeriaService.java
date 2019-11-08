package com.thp.spring.projetlibre.service;

import java.util.List;

import com.thp.spring.projetlibre.dto.PizzeriaDTO;
import com.thp.spring.projetlibre.entities.PizzeriaEntity;

public interface PizzeriaService {

	PizzeriaDTO findById(Long id_pizzeria);

	List<PizzeriaDTO> findAll();

	void deletePizzeria(Long id_pizzeria);

	PizzeriaEntity addPizzeria(PizzeriaDTO pizzeriaDTO);

	PizzeriaEntity upadtePizzeria(PizzeriaDTO p, Long id_pizzeria);
}
