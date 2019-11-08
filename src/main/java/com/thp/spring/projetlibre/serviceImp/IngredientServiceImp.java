package com.thp.spring.projetlibre.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.IngredientDTO;
import com.thp.spring.projetlibre.entities.IngredientEntity;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.IngredientRepository;
import com.thp.spring.projetlibre.service.IngredientService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class IngredientServiceImp implements IngredientService {
	
	@Autowired
	IngredientRepository ingredientRepository;

	@Override
	public IngredientDTO findById(Long id_ingredient) {
		IngredientEntity ingredient = ingredientRepository.findById(id_ingredient).orElse(null);
		return ModelMapperConverter.converToDTO(ingredient, IngredientDTO.class);
	}

	@Override
	public List<IngredientDTO> findAll() {
		List<IngredientEntity> ingredient = ingredientRepository.findAll();
		return ModelMapperConverter.convertAllToDTO(ingredient, IngredientDTO.class);
	
	}

	@Override
	public void deleteIngredient(Long id) {
		ingredientRepository.deleteById(id);
		
	}

	@Override
	public IngredientEntity addIngredient(IngredientDTO ingredientDTO) {
		IngredientEntity ingredient = ModelMapperConverter.converToEntity(ingredientDTO, IngredientEntity.class);
		return ingredientRepository.save(ingredient);

	}

	@Override
	public IngredientEntity upadteIngredient(IngredientDTO i, Long id_ingredient) {
		IngredientEntity ingredientById = ingredientRepository.findById(id_ingredient).orElse(null);
		IngredientEntity ingredient = ModelMapperConverter.converToEntity(i, IngredientEntity.class);
		if (ingredientById != null) {
			ingredient.setId(id_ingredient);

		}
		return ingredientRepository.save(ingredient);

	}
}
