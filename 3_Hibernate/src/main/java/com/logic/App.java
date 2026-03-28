package com.logic;

import java.util.Arrays;

import com.logic.dao.CourseDAO;
import com.logic.entity.Course;
import com.logic.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		SessionFactory sessionFactory = (SessionFactory) HibernateUtil.getSessionFactory();

//		Student student = new Student();
//
//		student.setName("arun");
//		student.setAge(23);
//		student.setCity("Delhi");
//
//		Session session = sessionFactory.openSession();
//
//		Transaction transaction = null;
//
//		try {
//			transaction = session.beginTransaction();
//
//			session.persist(student); // save krwa -> mapping
//			System.out.println("Data Saved");
//			transaction.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		System.out.println(sessionFactory);

//		StudentDao dao = new StudentDAOImp();
//		data abstraction
//		interface(function name) ----> Implement

//		insert
//		Student s1 = new Student();
//
//		s1.setName("Manoj");
//		s1.setCity("Delhi");
//		s1.setAge(45);
//		
//		
//		dao.saveStudent(s1);

//		update -> id hai ->data print 
//		Student s1 = dao.getStudentbyId(1);
//
//		if (s1 != null) {
//			System.out.println("Name" + s1.getName());
//			System.out.println("City" + s1.getCity());
//			System.out.println("Age" + s1.getAge());
//		}
//
//		update
//		s1.setCity("Pune");
//		dao.updateStudent(s1);

//		getAllData

//		List<Student> list = dao.getAllStudents();
//
//		for (Student s : list) {
//			System.out.println(s.getStudentID() + " " + s.getName() + " " + s.getCity() + " " + s.getAge());
//		}

//		Delete
//		dao.deleteStudent(1);
//
//		Department dept = new Department("Computer Science"); // 3
////	
////
//		Student s1 = new Student("Aditya", 22, "Agra"); // 1
//		Student s2 = new Student("Ashutosh", 24, "Punjab"); // 2
//
//		s1.setDepartment(dept); // 1 --- Dept - 5
//		s2.setDepartment(dept); // 2 --- dept - 5
//		
//		dept.setStudents(Arrays.asList(s1, s2));
//		
//		
//		DepartmentDAO daoD = new DepartmentDAO();
//		
//		daoD.saveDepartment(dept);
////
		Course c1 = new Course("Java");
        Course c2 = new Course("Hibernate");

        Student s1 =
            new Student("Pawan hdsa", 22, "Jaipur");

        Student s2 =
            new Student("Pulkit jsad", 25, "Ajmer");

        // Set Courses to Students

        s1.setCourses(Arrays.asList(c1, c2));
        s2.setCourses(Arrays.asList(c1));

        // Set Students to Courses (IMPORTANT)

        c1.setStudents(Arrays.asList(s1, s2));
        c2.setStudents(Arrays.asList(s1));

        CourseDAO dao = new CourseDAO();

        dao.saveStudent(s1);
        dao.saveStudent(s2);
//		

	}
}
