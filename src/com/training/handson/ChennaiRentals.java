package com.training.handson;

public abstract class ChennaiRentals {
private long serialNumber;
private double price;
private String itemName;
private long rantDays;
private long quantity;





public ChennaiRentals(long serialNumber, double price, String itemName, long rantDays, long quantity) {
	super();
	this.serialNumber = serialNumber;
	this.price = price;
	this.itemName = itemName;
	this.rantDays = rantDays;
	this.quantity=quantity;
}





public abstract void getProdInfo();





public long getSerialNumber() {
	return serialNumber;
}





public double getPrice() {
	return price;
}





public String getItemName() {
	return itemName;
}





public long getRantDays() {
	return rantDays;
}
public long getQuantity() {
	return quantity;
}

}
