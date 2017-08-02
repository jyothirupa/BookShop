package com.bookshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.model.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean insertBook(Book book) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(book);
			tx.commit();
			session.flush();
			session.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public Book updateBook(Book book) {

		return null;
	}

	public void deleteBook(int id) {

	}

	public Book getBookById(int id) {

		return null;
	}

	public List<Book> getAllBooks() {
		Session session = sessionFactory.openSession();

		// select * from Book;

		Query query = session.createQuery("from Book");
		List<Book> books = query.list();

		return books;
	}

}