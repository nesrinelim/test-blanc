package com.thp.spring.projetlibre.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class StockEntity extends MyEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8110984425044765359L;
	@EmbeddedId
	@Column(name = "id_stock")
	private StockId stockId;
	@Column(name = "quantite")
	private Double quantite;
	@ManyToOne
	@JoinColumn(name = "idPizzeria", referencedColumnName = "id_pizzeria", insertable = false, updatable = false)
	private PizzeriaEntity pizzeriaEntity;
	@ManyToOne
	@JoinColumn(name = "idIngredient", referencedColumnName = "id_ingredient", insertable = false, updatable = false)
	private IngredientEntity ingredientEntity;

	public StockId getStockId() {
		return stockId;
	}

	public PizzeriaEntity getPizzeriaEntity() {
		return pizzeriaEntity;
	}

	public IngredientEntity getIngredientEntity() {
		return ingredientEntity;
	}

	public Double getQuantite() {
		return quantite;
	}

	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}

	public void setStockId(StockId stockId) {
		this.stockId = stockId;
	}

	public void setPizzeriaEntity(PizzeriaEntity pizzeriaEntity) {
		this.pizzeriaEntity = pizzeriaEntity;
	}

	public void setIngredientEntity(IngredientEntity ingredientEntity) {
		this.ingredientEntity = ingredientEntity;
	}

	@Override
	public String toString() {
		return "StockEntity [stockId=" + stockId + ", quantite=" + quantite + ", pizzeriaEntity=" + pizzeriaEntity
				+ ", ingredientEntity=" + ingredientEntity + "]";
	}

	public StockEntity(StockId stockId, Double quantite, PizzeriaEntity pizzeriaEntity,
			IngredientEntity ingredientEntity) {
		super();
		this.stockId = stockId;
		this.quantite = quantite;
		this.pizzeriaEntity = pizzeriaEntity;
		this.ingredientEntity = ingredientEntity;
	}

	public StockEntity(Double quantite, PizzeriaEntity pizzeriaEntity, IngredientEntity ingredientEntity) {
		super();
		this.quantite = quantite;
		this.pizzeriaEntity = pizzeriaEntity;
		this.ingredientEntity = ingredientEntity;
	}

	public StockEntity() {
		super();
	}

	public StockEntity(StockId stockId, Double quantite) {
		super();
		this.stockId = stockId;
		this.quantite = quantite;
	}

}
