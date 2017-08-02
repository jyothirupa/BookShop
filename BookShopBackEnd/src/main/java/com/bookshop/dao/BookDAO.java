package com.bookshop.dao;

import java.util.List;

import com.bookshop.model.Book;

public interface BookDAO {

	public boolean  insertBook(Book book);

	public Book updateBook(Book book);

	void deleteBook(int id);

	Book getBookById(int id);

	List<Book> getAllBooks();

}
