package com.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class SalesPerson {
	
	@Id
	private int personId;
	private String personName;
	
	@OneToMany(mappedBy="salesPerson",cascade=CascadeType.PERSIST)
	private List<Order> orderList;
	
	@ManyToOne
	@JoinColumn(name="sales")
	private Sales sales;

	public int getPersonId() {
		return personId;
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public SalesPerson() {
		super();
	}
	
}
