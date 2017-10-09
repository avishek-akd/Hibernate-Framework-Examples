package com.avishek.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab17A {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		Student std1 = new Student("abhi", "abhi@gmail.com", 1234);
		session.save(std1);
		
		
		Student std2 = new Student("papu", "papu@gmail.com", 4567);
		session.save(std2);
		
		Student std3 = new Student("bapi", "bapi@gmail.com", 7890);
		session.save(std3);
		
		Course c1 = new Course("java", 10, 100);
		session.save(c1);
		
		Course c2 = new Course("jdbc", 100, 1000);
		session.save(c2);
		
		Course c3 = new Course("jsp", 1000, 10000);
		session.save(c3);
		
		Set<Course> cs1 = new HashSet<Course>();
		cs1.add(c1);
		cs1.add(c2);
		cs1.add(c3);
		
		std1.setCourse(cs1);
		
		Set<Course> cs2 = new HashSet<Course>();
		cs2.add(c2);
		cs2.add(c3);
		
		std2.setCourse(cs2);
		
		Set<Course> cs3 = new HashSet<Course>();
		cs3.add(c1);
		cs3.add(c3);
		
		std3.setCourse(cs3);
		
		tx.commit();
		session.close();
		System.out.println("Record Inserted....");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		if (tx!=null) {
			tx.rollback();
		}
	}
	
	
}
}
