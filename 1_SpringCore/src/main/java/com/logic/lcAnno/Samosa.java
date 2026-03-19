package com.logic.lcAnno;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

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

	@PostConstruct
	public void start() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroy");
	}

}
