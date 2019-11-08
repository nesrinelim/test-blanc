package com.thp.spring.projetlibre.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.RecetteDTO;
import com.thp.spring.projetlibre.entities.RecetteEntity;
import com.thp.spring.projetlibre.entities.RecetteId;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.RecetteRepository;
import com.thp.spring.projetlibre.service.RecetteService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class RecetteServiceImpl implements RecetteService {

	@Autowired
	RecetteRepository recetteRepo;

	@Override
	public List<RecetteDTO> findAll() {
		List<RecetteEntity> r = recetteRepo.findAll();
		return ModelMapperConverter.convertAllToDTO(r, RecetteDTO.class);

	}

	@Override
	public void deleteRecette(long idProduit, long idIngredient) {
		RecetteId recetteId = new RecetteId(idProduit, idIngredient);
		recetteRepo.deleteById(recetteId);

	}
	
	@Override
	public RecetteEntity addRecette(Long idProduit, Long idIngredient, double quantite, String description) {
		RecetteId recetteId = new RecetteId(idProduit, idIngredient);
		RecetteEntity recette = new RecetteEntity(recetteId, quantite, description);
		return recetteRepo.save(recette);
	}

	@Override
	public RecetteDTO findById(long idProduit, long idIngredient) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*@Override
	public RecetteDTO findById(long idProduit, long idIngredient) {
		RecetteId recetteId = new RecetteId(idProduit,idIngredient);
		RecetteEntity recette = recetteRepo.findById(recetteId).orElse(null);
		return ModelMapperConverter.converToDTO(recette, RecetteDTO.class);
	}*/

}
