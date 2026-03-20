package com.logic.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

//	@Autowired
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Inside a setter method");
		this.address = address;
	}

	public Emp(Address address) {
		System.out.println("Inside a constructor");
		this.address = address;
	}

	public Emp() {
		super();

	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
