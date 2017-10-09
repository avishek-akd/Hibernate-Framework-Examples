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

public class Lab5A {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		
		
		Student st = new Student("papu","bbsr","ok",25000);
		session.save(st);
		
		CurrentStudent cst = new CurrentStudent("abhi","ctc","active",23000,10000,"9-10","banglore");
		session.save(cst);
		
		OldStudent ost = new OldStudent("abhi","ctc","inactive",23000,"TCS","a@tcs.com",33);
		session.save(ost);
		
		WeekdayStudent wdst = new WeekdayStudent("biku","bdk","active",34000,2300,"11-6","delhi","Btech","60%",23);
		session.save(wdst);
		
		WeekendStudent west = new WeekendStudent("mani","bls","active",24000,1400,"8-9","hydrabad","IBM","b@ibm.com",56);
		session.save(west);
		
		
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
