package com.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.model.*;

public class Service {
	EntityManager entityManager;
	public Service() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InventoryPU");
		entityManager=entityManagerFactory.createEntityManager();
	}
	
	public void saveItem(Item i) {
		EntityTransaction et = entityManager.getTransaction();
		et.begin();
		entityManager.persist(i);
		et.commit();
	}
	public void saveOrder(Order o) {
		EntityTransaction et = entityManager.getTransaction();
		et.begin();
		entityManager.persist(o);
		et.commit();
	}
	public void saveSales(Sales s) {
		EntityTransaction et = entityManager.getTransaction();
		et.begin();
		entityManager.persist(s);
		et.commit();
	}
	public void saveSalesPerson(SalesPerson sp) {
		EntityTransaction et = entityManager.getTransaction();
		et.begin();
		entityManager.persist(sp);
		et.commit();
	}
	public void saveTurnOver(TurnOver to) {
		EntityTransaction et = entityManager.getTransaction();
		et.begin();
		entityManager.persist(to);
		et.commit();
	}

}
