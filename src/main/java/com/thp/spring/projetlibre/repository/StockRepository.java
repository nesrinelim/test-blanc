package com.thp.spring.projetlibre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thp.spring.projetlibre.entities.StockEntity;
import com.thp.spring.projetlibre.entities.StockId;

public interface StockRepository extends JpaRepository<StockEntity, StockId> {

	
	
	// @Query(value = "select nom, quantite from ingredient,stock where
	// ingredient.id_ingredient IN (select stock.id_ingredient where
	// stock.id_pizzeria=1)", nativeQuery = true)
//	@Query("select c from IngredientEntity,StockEntity where IngredientEntity.id IN (select StockEntity.stockId.idIngredient where StockEntity.idPizzeria=1")
	@Query(value = "select * from stock where stock.id_pizzeria=1", 
			  nativeQuery = true)
	
//	@Query(
//			  value = "select nom, quantite from stock u, ingredient p where u.id_ingredient  = 1)", 
//			  nativeQuery = true)
	List<StockEntity> findAllIngredientPizza();
	
}
