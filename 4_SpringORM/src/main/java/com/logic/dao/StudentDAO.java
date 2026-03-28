package com.logic.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.logic.entites.Student;

@Transactional
public class StudentDAO {

	private HibernateTemplate hibernateTemplate;

	// setter injection
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

//	save student
//	post
	public int insert(Student student) {
		int i = (int) this.hibernateTemplate.save(student);
		return i;
	}

//	get the singledata(object)
//	get mapping
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}

//	get all student
	public List<Student> getAllStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

//	deleting the data
	public void deleteStudent(int studentid) {
		Student student = this.hibernateTemplate.get(Student.class, studentid);
		this.hibernateTemplate.delete(student);
	}

//		updating the data
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);

	}

}
