package com.logic.ambiguity;

public class Add {
	private int a;
	private int b;

	public Add(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int, int");
	}

	public Add(String a, String b) {
		this.a = (Integer.parseInt(a));
		this.b = (Integer.parseInt(b));
		System.out.println("Constructor : String, String");
	}

	public Add(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double, double");
	}

	public void doSum() {
//		System.out.println("Sum is " + (this.a + this.b));

		System.out.println("Value of a is" + this.a);
		System.out.println("Value of b is" + this.b);
	}
}
