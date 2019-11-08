package com.thp.spring.projetlibre.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.ProduitDTO;
import com.thp.spring.projetlibre.entities.ProduitEntity;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.ProduitRepository;
import com.thp.spring.projetlibre.service.ProduitService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)

public class ProduitServiceImpl implements ProduitService {

	@Autowired
	ProduitRepository produitRepo;

	@Override
	public ProduitDTO findById(Long pdtId) {
		ProduitEntity pdt = produitRepo.findById(pdtId).orElse(null);
		System.out.println(pdt);
		System.out.println(ModelMapperConverter.converToDTO(pdt, ProduitDTO.class));
		return ModelMapperConverter.converToDTO(pdt, ProduitDTO.class);
	}

	@Override
	public ProduitDTO findByNom(String nom) {
		ProduitEntity pdt = produitRepo.findByNom(nom);
		System.out.println(pdt+"msg");
		return ModelMapperConverter.converToDTO(pdt, ProduitDTO.class);

	}

	@Override
	public List<ProduitDTO> findAll() {
		List<ProduitEntity> pdt = produitRepo.findAll();
		return ModelMapperConverter.convertAllToDTO(pdt, ProduitDTO.class);
	}

	@Override
	public void deleteProduit(Long pdtId) {
		produitRepo.deleteById(pdtId);

	}

	@Override
	public ProduitEntity addProduit(ProduitDTO pdtDTO) {
		ProduitEntity pdt = ModelMapperConverter.converToEntity(pdtDTO, ProduitEntity.class);
		return produitRepo.save(pdt);
	}

}
