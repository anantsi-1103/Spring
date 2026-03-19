package com.logic.lcInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa implements InitializingBean, DisposableBean {
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

//	init
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init method");
	}

//	destroy
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy method");
	}

}
