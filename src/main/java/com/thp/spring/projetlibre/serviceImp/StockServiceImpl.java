package com.thp.spring.projetlibre.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.StockDTO;
import com.thp.spring.projetlibre.entities.StockEntity;
import com.thp.spring.projetlibre.entities.StockId;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.StockRepository;
import com.thp.spring.projetlibre.service.StockService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class StockServiceImpl implements StockService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public List<StockDTO> findAll() {
		List<StockEntity> stock = stockRepository.findAll();
		return ModelMapperConverter.convertAllToDTO(stock, StockDTO.class);
	
	}

	@Override
	public StockEntity addStock(long idPizzeria, long idIngredient,Double quantite ) {
		StockId stockId=new StockId(idPizzeria,idIngredient);
		StockEntity stock= new StockEntity(stockId, quantite);
		return stockRepository.save(stock);
}

	@Override
	public StockDTO findById(long idPizzeria, long idIngredient) {
		StockId stockId=new StockId(idPizzeria,idIngredient);
		StockEntity stock = stockRepository.findById(stockId).orElse(null);
		return ModelMapperConverter.converToDTO(stock, StockDTO.class);
	}


	@Override
	public List<StockDTO> findAllIngredientPizza(){
		List<StockEntity> stock = stockRepository.findAllIngredientPizza();
		return ModelMapperConverter.convertAllToDTO(stock, StockDTO.class);
	}
	
		@Override
	public StockEntity upadteStock(StockDTO p, Long idPizzeria, Long idIngredient) {
		StockId stockId=new StockId(idPizzeria,idIngredient);
		StockEntity stockById = stockRepository.findById(stockId).orElse(null);
		StockEntity stock = ModelMapperConverter.converToEntity(p, StockEntity.class);
		
		return stockRepository.save(stock);
	}

		
	
}
