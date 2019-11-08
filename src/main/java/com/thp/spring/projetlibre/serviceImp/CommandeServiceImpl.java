package com.thp.spring.projetlibre.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.CommandeDTO;
import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.CommandeRepository;
import com.thp.spring.projetlibre.service.CommandeService;
import com.thp.spring.projetlibre.util.Etat;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class CommandeServiceImpl  implements CommandeService {

	@Autowired
	CommandeRepository commandeRepo;
	
	@Override
	public CommandeDTO findById(Long cmdId) {
		CommandeEntity cmd = commandeRepo.findById(cmdId).orElse(null);
		return ModelMapperConverter.converToDTO(cmd, CommandeDTO.class);
	}

	@Override
	public CommandeDTO findByStatus(Etat etatDispo) {
		CommandeEntity cmd = commandeRepo.findByStatus(etatDispo);
		return ModelMapperConverter.converToDTO(cmd, CommandeDTO.class);
	}

	@Override
	public List<CommandeDTO> findAll() {
		List<CommandeEntity> cmd = commandeRepo.findAll();
		return ModelMapperConverter.convertAllToDTO(cmd, CommandeDTO.class);
	}

	@Override
	public void deleteCommande(Long commandeId) {
		commandeRepo.deleteById(commandeId);
		
	}

	
	@Override
	public CommandeEntity addCommande(CommandeDTO cmdDTO) {
		CommandeEntity cmd = ModelMapperConverter.converToEntity(cmdDTO, CommandeEntity.class);
		return commandeRepo.save(cmd);
	}

	@Override
	public List<CommandeDTO> findCommandeByUtilisateur(Long idUser) {
		List<CommandeEntity> cmd  = commandeRepo.findCommandeByUtilisateurId(idUser);
		return ModelMapperConverter.convertAllToDTO(cmd, CommandeDTO.class);
				
	}
//	@Override
//	public CommandeDTO findByUserId(Long id) {
//		CommandeEntity cmd = commandeRepo.findByUtilisateurID(id);
//
//		return ModelMapperConverter.converToDTO(cmd, CommandeDTO.class);
//	}

	

	

	

}
