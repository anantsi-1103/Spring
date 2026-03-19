package com.logic.ci;

public class Person {

	private int PersonID;
	private String name;

	public Person(int personID, String name) {
		super();
		PersonID = personID;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [PersonID=" + PersonID + ", name=" + name + "]";
	}

}
