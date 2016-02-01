package com.training.handson;

public class Vessel extends ChennaiRentals {

	public Vessel(long serialNumber, double price, String itemName, long rantDays, long quantity) {
		super(serialNumber, price, itemName, rantDays, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getProdInfo() {
		System.out.println("serial no.-"+this.getSerialNumber());
		System.out.println("price.-"+this.getPrice());
		System.out.println("item name.-"+this.getItemName());
		System.out.println("rent days-"+this.getRantDays());
		System.out.println("quantity-"+this.getQuantity());
		// TODO Auto-generated method stub

	}

}
