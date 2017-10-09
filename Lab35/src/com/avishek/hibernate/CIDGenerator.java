package com.avishek.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CIDGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
	
		String cid = "14cse001";
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session  = sf.openSession();
			tx = session.beginTransaction();
			
			String hql1 = "from Customer cust";
			Query q = session.createQuery(hql1);
			int size = q.list().size();
			
			if (size!=0) {
				String hql2 = "select max(cust.id) from Customer cust";
				 q = session.createQuery(hql2);
				String id = (String) q.uniqueResult();
				 
				 
				 
				
				 String int_part = id.substring(5);
				 int x = Integer.parseInt(int_part);
				 x = x+1;
				
				 if (x<=9) {
					 cid = "14cse00"+x;
				}else if(x<=99){
					cid = "14cse0"+x;
				}else if(x<=999){
					cid = "14cse"+x;
				}
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
		
	return cid;
	}

}
