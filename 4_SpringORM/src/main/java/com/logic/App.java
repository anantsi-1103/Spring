package com.logic;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.protobuf.Empty;
import com.logic.dao.StudentDAO;
import com.logic.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDAO studentDAO = context.getBean("sDAO", StudentDAO.class);

//		Student student = new Student(1122, "Aman", "Mumbai");
//
//		int r = studentDAO.insert(student);
//
//		System.out.println("done :  " + r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Press 1 For new Student");
		System.out.println("Press 2 For display all Students");
		System.out.println("Press 3 For getDetails of Single Student");
		System.out.println("Press 4 For Delete Students");
		System.out.println("Press 5 For Update Students");
		System.out.println("Press 6 for Exit");
		try {

			System.out.println("Enter your Choice");
			int inp = Integer.parseInt(br.readLine());

			switch (inp) {
			case 1:
				// add new students

				System.out.println("Enter user id");
				int uID = Integer.parseInt(br.readLine());

				System.out.println("Enter name");
				String name = (br.readLine());

				System.out.println("Enter city");
				String city = (br.readLine());

				Student s = new Student();

				s.setStudentId(uID);
				s.setStudentName(name);
				s.setStudentCity(city);

				int r = studentDAO.insert(s);

				System.out.println("Data Inserted :  " + r);

				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
