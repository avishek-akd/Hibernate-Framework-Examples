package com.avishek.hibernate;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab35 {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		
		Customer cust = new Customer("y","abc@gmail.com",1234,"BBSR",2300.0);
		System.out.println(session.save(cust).toString());
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
