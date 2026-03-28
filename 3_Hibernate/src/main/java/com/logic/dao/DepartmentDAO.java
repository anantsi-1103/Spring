package com.logic.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.logic.entity.Department;
import com.logic.util.HibernateUtil;

public class DepartmentDAO {

	public void saveDepartment(Department dept) {

		Transaction tx = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			tx = session.beginTransaction();

			session.persist(dept); // save krwa -> mapping
			System.out.println("Dept Saved Successfully");
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	public Department getDepartmentById(int id) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		return session.get(Department.class, id);

	}

	public void DeleteDepartment(int id) {

		Transaction tx = null;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			tx = session.beginTransaction();

			Department dept = session.get(Department.class, id);

			if (dept != null) {
				session.remove(dept);
			}

			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}

	}

}
