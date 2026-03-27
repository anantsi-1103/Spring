package com.logic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentID;

	@Column(name = "StudentName", length = 100, unique = true)
	private String name;

	@Column(name = "StudentAge", nullable = false)
	private int age;

	@Column(name = "StudentCity")
	private String city;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getStudentID() {
		return studentID;
	}

	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(long studentID, String name, int age, String city) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
