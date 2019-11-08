package com.thp.spring.projetlibre.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.PizzeriaDTO;
import com.thp.spring.projetlibre.entities.PizzeriaEntity;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.PizzeriaRepository;
import com.thp.spring.projetlibre.service.PizzeriaService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class PizzeriaServiceImpl implements PizzeriaService {

	@Autowired
	PizzeriaRepository pizzeriaRepository;

	@Override
	public PizzeriaDTO findById(Long idPizzeria) {
		PizzeriaEntity pizzeria = pizzeriaRepository.findById(idPizzeria).orElse(null);
		return ModelMapperConverter.converToDTO(pizzeria, PizzeriaDTO.class);
	}

	@Override
	public List<PizzeriaDTO> findAll() {
		List<PizzeriaEntity> pizzeria = pizzeriaRepository.findAll();
		return ModelMapperConverter.convertAllToDTO(pizzeria, PizzeriaDTO.class);
	}

	@Override
	public void deletePizzeria(Long id) {
		pizzeriaRepository.deleteById(id);

	}

	@Override
	public PizzeriaEntity addPizzeria(PizzeriaDTO pizzeriaDTO) {
		PizzeriaEntity pizzeria = ModelMapperConverter.converToEntity(pizzeriaDTO, PizzeriaEntity.class);
		return pizzeriaRepository.save(pizzeria);

	}

	@Override
	public PizzeriaEntity upadtePizzeria(PizzeriaDTO p, Long id_pizzeria) {
		PizzeriaEntity pizzeriaById = pizzeriaRepository.findById(id_pizzeria).orElse(null);
		PizzeriaEntity pizzeria = ModelMapperConverter.converToEntity(p, PizzeriaEntity.class);
		if (pizzeriaById != null) {
			pizzeria.setId(id_pizzeria);

		}
		return pizzeriaRepository.save(pizzeria);
	}

}
