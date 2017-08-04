package com.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookshop.dao.BookDAO;
import com.bookshop.dao.CategoryDAO;
import com.bookshop.dao.SupplierDAO;
import com.bookshop.model.Book;
import com.bookshop.model.Category;
import com.bookshop.model.Supplier;

@Controller
public class AdminController {

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	SupplierDAO supplierDAO;

	@Autowired
	BookDAO bookDAO;

	@Autowired
	Category category;

	@Autowired
	Supplier supplier;

	@Autowired
	Book book;

	@RequestMapping("/manage_categories")
	public ModelAndView manageCategories() {

		ModelAndView mv = new ModelAndView("adminHome");
		mv.addObject("isUserClickedCategories", "true");

		List<Category> categoryList = categoryDAO.getAllCategories();
		mv.addObject("categoryList", categoryList);//model
		mv.addObject("category", category);//domain Object
		return mv;

	}

	@RequestMapping("/manage_products")
	public ModelAndView manageProducts() {

		ModelAndView mv = new ModelAndView("adminHome");
		mv.addObject("isUserClickedBooks", "true");
		List<Book> productList = bookDAO.getAllBooks();
		mv.addObject("productList", productList);
		mv.addObject("book", book);

		return mv;
	}

	@RequestMapping("/manage_suppliers")
	public ModelAndView manageSuppliers() {

		ModelAndView mv = new ModelAndView("adminHome");
		mv.addObject("isUserClickedSuppliers", "true");
		List<Supplier> supplierList = supplierDAO.getAllSuppliers();
		mv.addObject("supplierList", supplierList);
		mv.addObject("supplier", supplier);
		return mv;

	}
}
