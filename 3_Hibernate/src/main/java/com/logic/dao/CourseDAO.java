package com.logic.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.logic.entity.Student;
import com.logic.util.HibernateUtil;

public class CourseDAO {

    public void saveStudent(Student student) {

        Transaction tx = null;

        Session session = null;

        try {

            session =
                HibernateUtil.getSessionFactory()
                             .openSession();

            tx = session.beginTransaction();

            session.persist(student);

            tx.commit();

            System.out.println(
                "Student Saved With Course"
            );

        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();   // now safe
            }

            e.printStackTrace();

        } finally {

            if (session != null) {
                session.close(); // close here
            }
        }
    }
}