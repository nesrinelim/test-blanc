package com.thp.spring.projetlibre.dto;

import com.thp.spring.projetlibre.entities.StockId;

public class StockDTO extends MyDTO {

	private StockId stockId;
	private Double quantite;
	private PizzeriaDTO pizzeriaEntity;
	private IngredientDTO ingredientEntity;
	public StockId getStockId() {
		return stockId;
	}
	public void setStockId(StockId stockId) {
		this.stockId = stockId;
	}
	public Double getQuantite() {
		return quantite;
	}
	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}
	public PizzeriaDTO getPizzeriaEntity() {
		return pizzeriaEntity;
	}
	public void setPizzeriaEntity(PizzeriaDTO pizzeriaEntity) {
		this.pizzeriaEntity = pizzeriaEntity;
	}
	public IngredientDTO getIngredientEntity() {
		return ingredientEntity;
	}
	public void setIngredientEntity(IngredientDTO ingredientEntity) {
		this.ingredientEntity = ingredientEntity;
	}
	@Override
	public String toString() {
		return "StockDTO [stockId=" + stockId + ", quantite=" + quantite + ", pizzeriaEntity=" + pizzeriaEntity
				+ ", ingredientEntity=" + ingredientEntity + "]";
	}
	public StockDTO(StockId stockId, Double quantite, PizzeriaDTO pizzeriaEntity, IngredientDTO ingredientEntity) {
		super();
		this.stockId = stockId;
		this.quantite = quantite;
		this.pizzeriaEntity = pizzeriaEntity;
		this.ingredientEntity = ingredientEntity;
	}
	public StockDTO() {
		super();
	}

	
	
}
