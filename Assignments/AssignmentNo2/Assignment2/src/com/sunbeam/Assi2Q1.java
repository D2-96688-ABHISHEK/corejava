package com.sunbeam;

import java.util.Scanner;

//. Create a class called Invoice that a hardware store might use to represent 
//an invoice for an item sold at the store. An Invoice should include four 
//pieces of information as instance variables—a part number (type String), a 
//part description (type String), a quantity of the item being purchased (type 
//int) and a price per item (double). Your class should have a constructor 
//that initializes the four instance variables. Provide a set and a get method 
//for each instance variable. calculates the invoice amount (i.e. multiplies the 
//quantity by the price per item), then returns the amount as a double value. 
//If the quantity is not positive, it should be set to 0. 
//If the price per item is not positive, it should be set to 0.0. 
//Write a test application named InvoiceTest that demonstrate class Invoice’s 
//capabilities. 

class Invoice{
	private String name;
	private String description;
	private int qty;
	private double price;
	
	public Invoice(String name, String description, int qty, double price) {
		this.name = name;
		this.description = description;
		this.setQty(qty);
		this.setPrice(price);
		
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDesc(String description) {
		this.description = description;
	}
	
	public void setQty(int qty) {
		if(qty < 0) {
			this.qty = 0;
		}else {
			this.qty = qty;
		}	
	}
	
	public void setPrice(double price) {
		if(price < 0) {
			this.price = 0.0;
		}else {
			this.price = price;
		}
	}
	
	//getters 
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double totalBill() {
		return this.price * this.qty;
	}
}

class InvoiceTest{
	Invoice invoice = new Invoice("Laptop","Dell Inspiron 15", 2, 55000.0 );
	
	public void acceptRecord() {
		System.out.println("=============================================");
		System.out.println("Enter Invoice Details : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name : ");
		String name = sc.nextLine();
		invoice.setName(name);
		
		System.out.print("Description : ");
		String description = sc.nextLine();
		invoice.setDesc(description);
		
		System.out.print("Quantity : ");
		int qty = sc.nextInt();
		invoice.setQty(qty);
		
		System.out.print("Price : ");
		double price = sc.nextDouble();
		invoice.setPrice(price);
	}
	
	public void printRecord() {
		System.out.println("=============================================");
		System.out.println("Invoice Record");
		System.out.println("Name : " + invoice.getName());
		System.out.println("Description : " + invoice.getDescription());
		System.out.println("Quantity : " + invoice.getQty());
		System.out.println("Price : " + invoice.getPrice());
		System.out.println("Total Bill : " + invoice.totalBill());
	}	
}

public class Assi2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoiceTest it1 = new InvoiceTest();
		it1.printRecord();
		
		it1.acceptRecord();
		it1.printRecord();

	}

}
