package com.thp.spring.projetlibre.serviceImp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.UtilisateurDTO;
import com.thp.spring.projetlibre.entities.UtilisateurEntity;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.UtilisateurRepository;
import com.thp.spring.projetlibre.service.UtilisateurService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UtilisateurServiceImp implements UtilisateurService {

	@Autowired
	UtilisateurRepository utilisateurRepository;

	@Override
	public UtilisateurDTO findById(Long userId) {
		UtilisateurEntity user = utilisateurRepository.findById(userId).orElse(null);
		return ModelMapperConverter.converToDTO(user, UtilisateurDTO.class);

	}

	@Override
	public UtilisateurDTO findByPseudo(String pseudo) {
		UtilisateurEntity user = utilisateurRepository.findByPseudo(pseudo);
		return ModelMapperConverter.converToDTO(user, UtilisateurDTO.class);
	}

	@Override
	public List<UtilisateurDTO> findAll() {
		List<UtilisateurEntity> user = utilisateurRepository.findAll();
		return ModelMapperConverter.convertAllToDTO(user, UtilisateurDTO.class);
	}

	@Override
	public void deleteUtilisateur(Long userId) {
		utilisateurRepository.deleteById(userId);
	}

	@Override
	public UtilisateurDTO addUtilisateur(UtilisateurDTO UtilisateurDTO) {
		UtilisateurEntity user = ModelMapperConverter.converToEntity(UtilisateurDTO, UtilisateurEntity.class);
		return ModelMapperConverter.converToDTO(utilisateurRepository.save(user),UtilisateurDTO.class);

	}

}
