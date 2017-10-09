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

public class Lab33 {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		
		Query q = session.getNamedQuery("AllCustomer");
		List<Customer> list = q.list();
		for (Customer cust : list) {
				System.out.println(cust);
		}
		
		
		q = session.getNamedQuery("city_wise");
		q.setString(0, "Bbsr");
		list = q.list();
		for (Customer cust : list) {
				System.out.println(cust);
		}
		
		q = session.getNamedQuery("pagination");
		q.setFirstResult(0);
		q.setMaxResults(3);
		list = q.list();
		for (Customer cust : list) {
				System.out.println(cust);
		}
	
		
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
