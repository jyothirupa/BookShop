package com.bookshop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.model.Book;

@Repository
@Transactional
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

	public void updateBook(Book book) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(book);
			tx.commit();
			session.flush();
			session.close();

		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void deleteBook(Book book) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(book);
		tx.commit();
		session.flush();
		session.close();

	}

	public Book getBookById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Book book = (Book) session.get(Book.class, id);
		tx.commit();
		session.flush();
		session.close();
		return book;
	}

	public List<Book> getAllBooks() {
		Session session = sessionFactory.openSession();

		// select * from Book;

		Query query = session.createQuery("from Book");
		List<Book> books = query.list();

		return books;
	}

}
