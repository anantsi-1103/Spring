package com.logic.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.logic.entity.Student;
import com.logic.util.HibernateUtil;

public class StudentDAOImp implements StudentDao {

	@Override
	public void saveStudent(Student student) {

		Transaction tx = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			tx = session.beginTransaction();

			session.persist(student); // save krwa -> mapping
			System.out.println("Data Saved Successfully");
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}

	}

	@Override
	public void updateStudent(Student student) {
		Transaction tx = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			tx = session.beginTransaction();

			session.merge(student); // save krwa -> mapping
			System.out.println("Data Updated Successfully");
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}

	}

	@Override
	public void deleteStudent(long id) {
		Transaction tx = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			tx = session.beginTransaction();

			Student student = session.get(Student.class, id);

			if (student != null) {
				session.remove(student);
				System.out.println("Student Deleted Successfully");
			} else {
				System.out.println("Student Not Found");
			}

			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}

	}

	@Override
	public Student getStudentbyId(long id) {
		Transaction tx = null;
		Student student = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			tx = session.beginTransaction();

			student = session.get(Student.class, id);
//			System.out.println("Data Updated Successfully");
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}

		return student;

	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			Query<Student> query = session.createQuery("from Student", Student.class);

			list = query.list();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}

}
