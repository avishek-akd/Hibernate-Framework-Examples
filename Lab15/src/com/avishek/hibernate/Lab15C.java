package com.avishek.hibernate;

import java.util.Set;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab15C {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		Request req = (Request)session.load(Request.class,1);
		System.out.println(req);
		
		Customer cust = req.getCustomer();
		System.out.println(cust);
		
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
