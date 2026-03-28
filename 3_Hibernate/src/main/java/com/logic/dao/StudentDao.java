package com.logic.dao;

import java.util.List;

import com.logic.entity.Student;

public interface StudentDao {
//	insert
	void saveStudent(Student student);

//	update
	void updateStudent(Student student);

//	delete
	void deleteStudent(long id);

//	getdatabyID
	Student getStudentbyId(long id);

//	get all data
	List<Student> getAllStudents();

}
