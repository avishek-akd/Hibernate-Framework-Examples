package com.avishek.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4A {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		String[] cs = {"java","hibernate","php"};
		
		List<String> emails = new ArrayList<String>();
		emails.add("a@gmail.com");
		emails.add("b@gmail.com");
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(30);
		marks.add(40);
		marks.add(70);
		
		Set<Long> phones = new  HashSet<Long>();
		phones.add(9777301031l);
		phones.add(9777301032l);
		phones.add(9777301033l);
		
		Map<String, Long> refs = new HashMap<String, Long>();
		refs.put("x", 1111l);
		refs.put("y", 1112l);
		refs.put("z", 1113l);
		
		
		Student st = new Student("avishek","10-10","Btech",cs,emails,marks,phones,refs);
		session.save(st);
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
