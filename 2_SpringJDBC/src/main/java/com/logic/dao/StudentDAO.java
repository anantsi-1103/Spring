package com.logic.dao;

import java.util.List;

import com.logic.Student;

// data abstraction
public interface StudentDAO {
	public int insert(Student student);

	public int change(Student student);
	
	public int delete(int id); 
	
	public Student getStudent(int id);
	
	
	public List<Student> getAllStudents();
}
