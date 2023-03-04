package com.jbk.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.entity.Product;

public class HibernateConfig {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionfactory() {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Product.class);
		sessionFactory = cfg.buildSessionFactory();

		return sessionFactory;

	}

}
