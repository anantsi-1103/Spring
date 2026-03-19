package com.logic.lcAnno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/logic/lcAnno/config.xml");

		Samosa s = (Samosa) context.getBean("samosa");

		System.out.println(s);
		// only for the destroy method -> 
		context.registerShutdownHook();

	}
}
