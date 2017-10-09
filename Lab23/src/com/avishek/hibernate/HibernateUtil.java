package com.avishek.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
static SessionFactory factory;
	static{
		
			Configuration cfg = new Configuration();
			cfg = cfg.configure();
			StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
			StandardServiceRegistry sr = ssrb.applySettings(cfg.getProperties()).build();
			factory = cfg.buildSessionFactory(sr);
	}
	
	public static SessionFactory getSessionFactory(){
		return factory;
	}
}
