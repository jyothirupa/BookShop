package com.bookshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	// To Register
	public boolean register(User user) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			user.setRole("ROLE_USER");
			user.setEnabled(true);
			session.saveOrUpdate(user);// db Operation
			tx.commit();
			session.flush();
			session.close();
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// To Validate
	public boolean login(String username, String password) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			// db Operation
			String hql = "from User where USERNAME='" + username + "'and PASSWORD='" + password + "'";
			User user = (User) session.createQuery(hql).uniqueResult();
			tx.commit();
			session.flush();
			session.close();
			if (user == null)
				return false;
			return true;

		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;

		}
	}

}
