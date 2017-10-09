package com.avishek.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Lab2 {
	public static void main(String[] args) {
		
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			
			Customer cust = (Customer) session.load(Customer.class, 5);

			
			System.out.print(cust.getName());
			System.out.print("\t");
			System.out.print(cust.getEmail());System.out.print("\t");
			System.out.print(cust.getEmail());System.out.print("\t");
			System.out.print(cust.getCity());System.out.print("\t");
			System.out.print(cust.getBal());
			
			
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
