package com.avishek.hibernate;

import java.util.List;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Lab32 {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		
		Query q = session.getNamedQuery("AllCustomer1");
		List<Object []> list = q.list();
		for (Object []object : list) {
			for (Object obj : object) {
				System.out.print(obj+"\t");
			}
		System.out.println();		
		}
		
		q = session.getNamedQuery("AllCustomer2");
		List<Customer > list1 = q.list();
		for (Customer cust : list1) {
				System.out.println(cust);
		}
		
		
		q = session.getNamedQuery("city_wise");
		q.setString(0, "Bbsr");
		list = q.list();
		for (Object []object : list) {
			for (Object obj : object) {
				System.out.print(obj+"\t");
			}
		System.out.println();		
		}
		
		
		
		
		
		/*List<Customer> list = q.list();
		for (Customer cust : list) {
				System.out.println(cust);
		}*/


		/*
		List<Object []> list = q.list();
		for (Object []object : list) {
			for (Object obj : object) {
				System.out.println(obj+"\t");
			}
		System.out.println();		
		}*/
	
	


		
		
		
		
		
		
		
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
