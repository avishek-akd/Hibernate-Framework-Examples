package com.avishek.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Lab1 {
	public static void main(String[] args) {
		
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			
			Customer cust = new Customer("Avishek", "a@gmail.com", 1234, "BBSR", 1000.0);
			session.save(cust);
			
			tx.commit();
			session.close();
			
			System.out.println("\n-----Record Inserted-----");
		} catch (Exception e) {
			
			e.printStackTrace();
			if (tx!=null) {
				tx.rollback();
			}
			
		}
		
		
		
		
		
		
	}
	
}
