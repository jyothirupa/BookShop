package com.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookshop.dao.BookDAO;
import com.bookshop.model.Book;

@Controller
public class BookController {

	@Autowired
	Book book;

	@Autowired
	BookDAO bookDAO;

	//add book get method
	@RequestMapping(value = "/manage_book_create", method = RequestMethod.GET)
	public ModelAndView getcreateBookForm() {

		ModelAndView mv = new ModelAndView("createBookForm");
		mv.addObject("createBookObj", book);// domain
		return mv;

	}

	//add book post method
	@RequestMapping(value = "/manage_book_create", method = RequestMethod.POST)
	public ModelAndView createBook(@ModelAttribute(value = "createBookObj") Book book) {

		ModelAndView mv = new ModelAndView("adminHome");
		if (bookDAO.insertBook(book)) {
			mv.addObject("message", "Successfully created the book");
			List<Book> bookList = bookDAO.getAllBooks();
			mv.addObject("bookList", bookList);
			mv.addObject("isUserClickedBooks", "true");

		} else {
			mv.addObject("message", "Not able to create Book.Please contact Administrator");
		}

		return mv;

	}

	//delete book method
	@RequestMapping(value = "/manage_book_delete/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable(value = "id") int id, Model model) {

		Book book = bookDAO.getBookById(id);
		bookDAO.deleteBook(book);
		return "redirect:/getAllBooks";

	}

	// displays all the books 
	@RequestMapping(value = "/getAllBooks")
	public ModelAndView getAllBooks() {
		List<Book> allbooks = bookDAO.getAllBooks();
		ModelAndView mv = new ModelAndView("book", "bookList", allbooks);
		return mv;
	}

	// edit book get method
	@RequestMapping(value = "/manage_book_edit/{id}", method = RequestMethod.GET)
	public ModelAndView getEditBookForm(@PathVariable(value = "id") int id) {

		Book book = this.bookDAO.getBookById(id);
		return new ModelAndView("editBookForm", "editBookObj", book);
	}

	// edit book post method
	@RequestMapping(value = "/manage_book_edit", method = RequestMethod.POST)
	public String editBook(@ModelAttribute(value = "editBookObj") Book book, Model model) {
		this.bookDAO.updateBook(book);
		return "redirect:/getAllBooks";

	}

}
