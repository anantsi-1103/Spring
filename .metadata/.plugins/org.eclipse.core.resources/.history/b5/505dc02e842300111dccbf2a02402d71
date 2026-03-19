package com.logic.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.logic.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/logic/reference/config.xml");

		A a = (A) context.getBean("Aref");
		System.out.println(a);

	}
}
