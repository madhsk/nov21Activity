package com.app;

import java.util.ArrayList;
import java.util.List;

import com.model.*;
import com.service.Service;

public class App {
    public static void main(String[] args) {
        // Initialize the service
        Service service = new Service();

        // Create TurnOver
        TurnOver turnOver = new TurnOver();
        turnOver.setYear("2024");

        // Create Sales
        Sales sales = new Sales();
        sales.setTotalSales(1550);
        sales.setTurnOver(turnOver); // Associate Sales with TurnOver
        List<Sales> salesList = new ArrayList<>();
        salesList.add(sales);
        turnOver.setSaleList(salesList);
        sales.setSaleId(1);

        // Create SalesPerson
        SalesPerson salesPerson = new SalesPerson();
        salesPerson.setPersonName("John Doe");
        salesPerson.setSales(sales); // Associate SalesPerson with Sales
        List<SalesPerson> salesPersons = new ArrayList<>();
        sales.setSalePersonList(salesPersons);
        salesPerson.setPersonId(1);

        // Create Order
        Order order = new Order();
        order.setDateOfDelivery("2024-11-21");
        order.setTotalAmount(1550.00f);
        order.setStatus(true);
        order.setSalesPerson(salesPerson);
        order.setOrderid(1);

        // Create Items
        Item item1 = new Item();
        item1.setItemName("Laptop");
        item1.setPrice(1500.00f);
        item1.setQuantity(2);
        item1.setAvailableInStock(5);
        item1.setItemid(1);

        Item item2 = new Item();
        item2.setItemName("Mouse");
        item2.setPrice(50.00f);
        item2.setQuantity(1);
        item2.setAvailableInStock(10);
        item2.setItemid(2);

        // Associate Items with Order
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        order.setItemList(items);

        // Associate Order with Items
        item1.setOrder(order);
        item2.setOrder(order);

        // Save entities in the correct order
        service.saveTurnOver(turnOver);  // Save TurnOver first
        service.saveSales(sales);     // Save Sales
        service.saveSalesPerson(salesPerson); // Save SalesPerson
        service.saveOrder(order);     // Save Order
        service.saveItem(item1);     // Save Items
        service.saveItem(item2);

        System.out.println("All entities have been persisted successfully!");
    }
}
