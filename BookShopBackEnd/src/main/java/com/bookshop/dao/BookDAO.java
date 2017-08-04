package com.bookshop.dao;

import java.util.List;

import com.bookshop.model.Book;

public interface BookDAO {

	public boolean  insertBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(Book book);

	public Book getBookById(int id);

	public List<Book> getAllBooks();

}
