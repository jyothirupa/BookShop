package com.bookshop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.model.Supplier;

@Repository
@Transactional
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean insertSupplier(Supplier supplier) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(supplier);
			tx.commit();
			session.flush();
			session.close();
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public void updateSupplier(Supplier supplier) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(supplier);
			tx.commit();
			session.flush();
			session.close();

		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void deleteSupplier(Supplier supplier) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(supplier);
		tx.commit();
		session.flush();
		session.close();

	}

	public Supplier getSupplierById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Supplier supplier = (Supplier) session.get(Supplier.class, id);
		tx.commit();
		session.flush();
		session.close();
		return supplier;
	}

	public List<Supplier> getAllSuppliers() {
		Session session = sessionFactory.openSession();

		// select * from Supplier;

		Query query = session.createQuery("from Supplier");
		List<Supplier> categories = query.list();

		return categories;
	}

}
