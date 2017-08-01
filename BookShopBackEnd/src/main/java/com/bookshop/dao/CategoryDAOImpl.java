package com.bookshop.dao;
/*
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO{

	@Autowired
	SessionFactory sessionFactory;

	public Category insertCategory(Category category) {
		Session session = sessionFactory.openSession();
		session.save(category);
		session.flush();
		session.close();
		return category;
	}

	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		
	}

	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> getAllCategories() {
		Session session = sessionFactory.openSession();

		// select * from Category;

		Query query = session.createQuery("from Category");
		List<Category> categories=query.list();

		return categories;
	}
	
	

}
*/