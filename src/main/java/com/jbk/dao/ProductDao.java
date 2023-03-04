package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jbk.config.HibernateConfig;
import com.jbk.entity.Product;

public class ProductDao {

	public static String saveProduct(Product product) {
		SessionFactory sessionfactory = HibernateConfig.getSessionfactory();
		boolean isAdded = false;
		String msg = null;

		try {
			Session session = sessionfactory.openSession();
			session.save(product);
			Transaction transaction = session.beginTransaction();
			session.save(product);
			transaction.commit();
			isAdded = true;

		} catch (Exception e) {
			e.printStackTrace();

		}
		if (isAdded) {
			msg = "Saved !!";
		} else {
			msg = "Not Saved !!";
		}
		return msg;

	}

	public Product getProductById(int id) {
		SessionFactory sessionFactory = HibernateConfig.getSessionfactory();
		Product product = null;
		try {
			Session session = sessionFactory.openSession();
			product = session.get(Product.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return product;

	}

}
