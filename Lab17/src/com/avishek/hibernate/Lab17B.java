package com.avishek.hibernate;

import java.util.Set;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab17B {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		
		
		
		Student std = (Student)session.load(Student.class, 3);
		System.out.println(std);
		
		Set<Course> c1 = std.getCourse();
		System.out.println(c1.size());
		for (Course course : c1) {
			System.out.println(course);
		}
		
		
		tx.commit();
		session.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		if (tx!=null) {
			tx.rollback();
		}
	}
	
	
}
}
