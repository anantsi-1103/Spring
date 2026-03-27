package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.logic.entity.Student;
import com.logic.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = (SessionFactory) HibernateUtil.getSessionFactory();

		Student student = new Student();

		student.setName("arun");
		student.setAge(23);
		student.setCity("Delhi");

		Session session = sessionFactory.openSession();

		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			session.persist(student); // save krwa -> mapping
			System.out.println("Data Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

//		System.out.println(sessionFactory);
	}
}
