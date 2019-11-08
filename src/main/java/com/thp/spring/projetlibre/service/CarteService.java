package com.thp.spring.projetlibre.service;

import java.util.List;

import com.thp.spring.projetlibre.dto.CarteDTO;
import com.thp.spring.projetlibre.entities.CarteEntity;

public interface CarteService {

	CarteDTO findById(Long carteId);


	List<CarteDTO > findAll();

	void deleteCarte(Long carteId);

	CarteEntity addCarte(CarteDTO  carteDTO);

}
