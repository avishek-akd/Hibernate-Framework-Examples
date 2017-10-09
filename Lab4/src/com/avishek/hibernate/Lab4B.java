package com.avishek.hibernate;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4B {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		Student st = (Student)session.load(Student.class,1);
	
		System.out.println(st);		
		System.out.println(st.getCourse());		
		System.out.println(st.getEmails());
		System.out.println(st.getMarks());
		System.out.println(st.getPhones());
		System.out.println(st.getRefs());
		
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
