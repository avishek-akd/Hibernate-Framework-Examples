package com.avishek.hibernate;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2A {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		Customer cust = new Customer(5,"papu","abc@gmail.com",1234,"BBSR",2300.0);
		session.save(cust);
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
