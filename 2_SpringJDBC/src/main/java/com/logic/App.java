package com.logic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.logic.dao.StudentDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/logic/config.xml");

//		JdbcTemplate temp = (JdbcTemplate) context.getBean("jdbcTemp");

//		String query = "insert into student values(?,?,?) ";
//
////		
//		int res = temp.update(query, 102, "Ajay", "Gurugram");
//
//		System.out.println(res);

		StudentDAO s = context.getBean("sDAO", StudentDAO.class);

		Student student = new Student();

		student.setId(105);
		student.setName("Swastik");
		student.setCity("Bihar");

		int res = s.insert(student);

		System.out.println(res);

	}

}
