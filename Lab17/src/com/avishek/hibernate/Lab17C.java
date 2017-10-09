package com.avishek.hibernate;

import java.util.Set;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab17C {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		Course c1 = (Course)session.load(Course.class,2);
		System.out.println(c1);
		
		
		Set<Student> std = c1.getStudent();
		System.out.println(std.size());
		for (Student student : std) {
			System.out.println(student);
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
