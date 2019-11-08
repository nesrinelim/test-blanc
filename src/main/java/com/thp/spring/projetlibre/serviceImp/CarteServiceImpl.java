package com.thp.spring.projetlibre.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.CarteDTO;
import com.thp.spring.projetlibre.entities.CarteEntity;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.CarteRepository;
import com.thp.spring.projetlibre.service.CarteService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)

public class CarteServiceImpl implements CarteService {
	
	@Autowired
	CarteRepository carteRepo;

	@Override
	public CarteDTO findById(Long carteId) {
		CarteEntity cmd = carteRepo.findById(carteId).orElse(null);
		return ModelMapperConverter.converToDTO(cmd, CarteDTO.class);
	}

	@Override
	public List<CarteDTO> findAll() {
		List<CarteEntity> cmd = carteRepo.findAll();
		return ModelMapperConverter.convertAllToDTO(cmd, CarteDTO.class);
	}

	@Override
	public void deleteCarte(Long carteId) {
		carteRepo.deleteById(carteId);
		
	}

	@Override
	public CarteEntity addCarte(CarteDTO carteDTO) {
		CarteEntity cmd = ModelMapperConverter.converToEntity(carteDTO, CarteEntity.class);
		return carteRepo.save(cmd);
	}

}
