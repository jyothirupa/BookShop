package com.bookshop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.model.Category;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean insertCategory(Category category) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(category);
			tx.commit();
			session.flush();
			session.close();
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public void updateCategory(Category category) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(category);
			tx.commit();
			session.flush();
			session.close();

		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void deleteCategory(Category category) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(category);
		tx.commit();
		session.flush();
		session.close();

	}

	public Category getCategoryById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Category category = (Category) session.get(Category.class, id);
		tx.commit();
		session.flush();
		session.close();
		return category;
	}

	public List<Category> getAllCategories() {
		Session session = sessionFactory.openSession();

		// select * from Category;

		Query query = session.createQuery("from Category");
		List<Category> categories = query.list();

		return categories;
	}

}
