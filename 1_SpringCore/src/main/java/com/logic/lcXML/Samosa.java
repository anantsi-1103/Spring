package com.logic.lcXML;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Inside Setter Method");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void hi() {
		System.out.println("inside init method");
	}
	
	public void bye() {
		System.out.println("inside destroy method");
	}
	
}
