package com.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Sales {
	
	@Id
	private int saleId;
	
	@OneToMany(mappedBy="sales",cascade=CascadeType.PERSIST)
	private List<SalesPerson> salePersonList;
	
	@ManyToOne
    @JoinColumn(name = "turnOver_year")
    private TurnOver turnOver;
	
	public TurnOver getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(TurnOver turnOver) {
		this.turnOver = turnOver;
	}

	private int totalSales;

	public Sales() {
		super();
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public List<SalesPerson> getSalePersonList() {
		return salePersonList;
	}

	public void setSalePersonList(List<SalesPerson> salePersonList) {
		this.salePersonList = salePersonList;
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	
}
