package com.logic.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//xml file 
@Configuration
@ComponentScan(basePackages = "com.logic.javaConfig")
public class JavaConfig {
	
	@Bean
	public Samosa samosa(){
		return new Samosa();
	}
	
	
	
	@Bean("ob")
	public Student getStudent() {
		Student student = new Student(samosa());
		return student;
	}
}
