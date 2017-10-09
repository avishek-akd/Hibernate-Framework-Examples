package com.avishek.hibernate;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab16A {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		Customer cust = new Customer("Avishek","das","abc@gmail.com",1234);
		session.save(cust);
		
		
		
		Request req1 = new Request("11/9/2013","loss1"," new1");
		session.save(req1);
		
		req1.setCustomer(cust);
		
		Request req2 = new Request("11/9/2014","loss2"," new2");
		session.save(req2);
		
		req2.setCustomer(cust);
		
		Request req3 = new Request("11/9/2015","loss3"," new3");
		session.save(req3);
		
		req3.setCustomer(cust);
		
	
		
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
