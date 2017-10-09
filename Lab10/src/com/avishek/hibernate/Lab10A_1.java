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

public class Lab10A_1 {
public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session  = sf.openSession();
		tx = session.beginTransaction();
		
		
		
		/*
		 * As we have to pass same sid values in all types student per particular record so
		 * we have to go for different session to store all types of student class objects
		 * 
		 * 
		 * Do not save all types of Student class objects in one session as it is impossible
		 * to pass same sid values
		 * 
		 * Following Error comes....
		 * 
		 * A different object with the same identifier value was already associated with 
		 * the session : [com.avishek.hibernate.CurrentStudent#1]
		
		
		Student st = new Student(1,"papu","bbsr","ok",25000);
		session.save(st);
		
		CurrentStudent cst = new CurrentStudent(1,"abhi","ctc","active",23000,10000,"9-10","banglore");
		session.save(cst);
		
		OldStudent ost = new OldStudent(1,"abhi","ctc","inactive",23000,"TCS","a@tcs.com",33);
		session.save(ost);
		
		WeekdayStudent wdst = new WeekdayStudent(1,"biku","bdk","active",34000,2300,"11-6","delhi","Btech","60%",23);
		session.save(wdst);
		
		WeekendStudent west = new WeekendStudent(1,"mani","bls","active",24000,1400,"8-9","hydrabad","IBM","b@ibm.com",56);
		session.save(west);
		
		*/
		
		Student st = new Student(1,"papu","bbsr","ok",25000);
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
