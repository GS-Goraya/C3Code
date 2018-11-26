package com.jlc.online.ws.dao.impl;

import java.util.*;
import org.hibernate.*;
import com.jlc.online.ws.StudentTO;
import com.jlc.online.ws.dao.StudentDAO;
import com.jlc.online.ws.hibernate.Student;
import com.jlcindia.util.HibernateUtil;

public class HibernateStudentDAO implements StudentDAO {
	public List<StudentTO> getAllStudents() {
		List<StudentTO> studList = null;
		Transaction tx = null;
		Session sess = null;

		try {
			sess = HibernateUtil.getSession();
			tx = sess.beginTransaction();
			List<Student> list = sess.createQuery("from Student").list();
			if (list.size() > 0) {
				studList = new ArrayList<StudentTO>();

			}
			Iterator<Student> it = list.iterator();
			while (it.hasNext()) {
				Student s = (Student) it.next();
				studList.add(new StudentTO(s.getSid(), s.getSname(), s.getEmail(), s.getPhone()));
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();

		} finally {
			if (sess != null)
				sess.close();
		}
		return studList;

	}

	public StudentTO getStudent(int id) {
		StudentTO stud = null;
		Session sess = null;
		Transaction tx = null;
		try {
			sess = HibernateUtil.getSession();
			tx = sess.beginTransaction();
			Object obj = sess.get(Student.class, id);
			if (obj != null) {
				Student st = (Student) obj;
				stud = new StudentTO(st.getSid(), st.getSname(), st.getEmail(), st.getPhone());
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		} finally {
			if (sess != null)
				sess.close();
		}
		return stud;
	}

	public void addStudent(String name, String email, long phone) {
		Session sess = null;
		Transaction tx = null;
		try {
			sess = HibernateUtil.getSession();
			tx = sess.beginTransaction();
			Student stud = new Student();
			stud.setSname(name);
			stud.setEmail(email);
			stud.setPhone(phone);
			sess.save(stud);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();

		} finally {
			if (sess != null)
				sess.close();

		}
	}
}
