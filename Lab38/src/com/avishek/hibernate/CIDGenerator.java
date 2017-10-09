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

public class CIDGenerator{

	public static SID getNextSid(String bid){
		
		SID studentid = null;
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session  = sf.openSession();
			tx = session.beginTransaction();
			
			String hql1 = "from Student stu where stu.studentid.bid=?";
			Query q = session.createQuery(hql1);
			q.setString(0, bid);
			List list = q.list();
			
			if (list.size()==0) {
				
				studentid = new SID(bid,"001");
			}else{	
				
				String hql2 = "select max(stu.studentid.sid) from Student stu";
				q = session.createQuery(hql2);
				String s = (String) q.uniqueResult();
				
				int id = Integer.parseInt(s);
				
				id = id+1;
				 
				
				 if (id<=9) {
					 studentid = new SID(bid,"00"+id);
				}else if(id<=99){
					studentid = new SID(bid,"0"+id);
				}else if(id<=999){
					studentid = new SID(bid,""+id);
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
		
	return studentid;
	}

}
