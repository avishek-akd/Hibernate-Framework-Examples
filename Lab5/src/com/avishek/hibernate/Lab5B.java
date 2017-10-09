package com.avishek.hibernate;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab5B {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		Student st = (Student)session.load(Student.class,1);	
		System.out.println(st);	
		
		CurrentStudent cst = (CurrentStudent)session.load(CurrentStudent.class,2);	
		System.out.println(cst);
		
		OldStudent ost = (OldStudent)session.load(OldStudent.class,3);	
		System.out.println(ost);
		
		WeekdayStudent wdst = (WeekdayStudent)session.load(WeekdayStudent.class,4);	
		System.out.println(wdst);
		
		WeekendStudent west = (WeekendStudent)session.load(WeekendStudent.class,5);	
		System.out.println(west);
		
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
