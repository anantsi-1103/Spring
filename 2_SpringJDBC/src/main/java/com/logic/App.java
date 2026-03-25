package com.logic;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.logic.dao.StudentDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/logic/config.xml");

//		JdbcTemplate temp = (JdbcTemplate) context.getBean("jdbcTemp");

//		String query = "insert into student values(?,?,?) ";
//

//		int res = temp.update(query, 102, "Ajay", "Gurugram");
//
//		System.out.println(res);

//		StudentDAO s = context.getBean("sDAO", StudentDAO.class);

//		Student student = new Student();
//
//		student.setId(105);
//		student.setName("Swastik");
//		student.setCity("Bihar");
//
//		int res = s.insert(student);
//
//		System.out.println(res);

//		Student student = new Student();
//
//		student.setId(102);
//		student.setName("Raj");
//		student.setCity("Chandigarh");
//
//		int r = s.change(student);
//		System.out.println(r);

//		int r = s.delete(102);
//		System.out.println(r);

//		Student student = s.getStudent(101);
//		System.out.println(student);

//		List<Student> students = s.getAllStudents();
//
//		// for - optimized way ->
//		for (Student i : students) {
//			System.out.println(i);
//		}
		
//		System.out.println(students);
		
		
//		Annotation
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		
		StudentDAO s = context.getBean("sDAO", StudentDAO.class);
//
//		Student student = new Student();
//
//		student.setId(110);
//		student.setName("Rahul");
//		student.setCity("Pune");

//		int res = s.insert(student);

//		System.out.println(res);
		
		List<Student> students = s.getAllStudents();

		// for - optimized way ->
		for (Student i : students) {
			System.out.println(i);
		}
	}

}
