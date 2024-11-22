package com.model;


import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="orderdetails")
public class Order {
	
	@Id
	private int orderid;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.PERSIST)
	private List<Item> itemList;
	
	@ManyToOne
	@JoinColumn(name="salesPerson")
	private SalesPerson salesPerson;
	private String dateOfDelivery;
	private float totalAmount;
	private boolean status;
	
	public SalesPerson getSalesPerson() {
		return salesPerson;
	}
	public void setSalesPerson(SalesPerson salesPerson) {
		this.salesPerson = salesPerson;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public String getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(String dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Order() {
		super();
	}
	
}
