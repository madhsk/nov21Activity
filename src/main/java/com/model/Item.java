package com.model;

import javax.persistence.*;

@Entity
public class Item {
	
	@Id
	private int itemid;
	private String itemName;
	private float price;
	private int quantity;
	private int availableInStock;
	@ManyToOne
	@JoinColumn(name="OrderNo")
	private Order order;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAvailableInStock() {
		return availableInStock;
	}
	public void setAvailableInStock(int availableInStock) {
		this.availableInStock = availableInStock;
	}
	public Item() {
		super();
	}
}
