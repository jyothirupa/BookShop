package com.bookshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	SessionFactory sessionFactory;

	public Book insertBook(Book book) {
		Session session = sessionFactory.openSession();
		session.save(book);
		session.flush();
		session.close();
		return book;
	}

	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteBook(int id) {
		// TODO Auto-generated method stub

	}

	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> getAllBooks() {
		Session session = sessionFactory.openSession();

		// select * from Book;

		Query query = session.createQuery("from Book");
		List<Book> books=query.list();

		return books;
	}

}*/