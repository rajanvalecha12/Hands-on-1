package com.training.handson;

import java.util.Scanner;

public class TaxWhizApplication {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		TaxWhiz taxWhiz=new TaxWhiz();
		System.out.println("Enter purchase amount : ");
		double purchase=0.0;
		purchase=sc.nextDouble();
		System.out.println("Sales tax : "+ taxWhiz.calcTax(purchase));
		sc.close();
		// TODO Auto-generated method stub

	}

}
