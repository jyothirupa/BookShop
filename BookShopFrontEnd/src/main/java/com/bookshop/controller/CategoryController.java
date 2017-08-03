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

import com.bookshop.dao.CategoryDAO;
import com.bookshop.model.Category;

@Controller
public class CategoryController {

	@Autowired
	Category category;

	@Autowired
	CategoryDAO categoryDAO;

	//add category get method
	@RequestMapping(value = "/manage_category_create", method = RequestMethod.GET)
	public ModelAndView getcreateCategoryForm() {

		ModelAndView mv = new ModelAndView("createCategoryForm");
		mv.addObject("createCategoryObj", category);// domain
		return mv;

	}

	//add category post method
	@RequestMapping(value = "/manage_category_create", method = RequestMethod.POST)
	public ModelAndView createCategory(@ModelAttribute(value = "createCategoryObj") Category category) {

		ModelAndView mv = new ModelAndView("adminHome");
		if (categoryDAO.insertCategory(category)) {
			mv.addObject("message", "Successfully created the category");
			List<Category> categoryList = categoryDAO.getAllCategories();
			mv.addObject("categoryList", categoryList);
			mv.addObject("isUserClickedCategories", "true");

		} else {
			mv.addObject("message", "Not able to create Category.Please contact Administrator");
		}

		return mv;

	}

	//delete category method
	@RequestMapping(value = "/manage_category_delete/{id}", method = RequestMethod.GET)
	public String deleteCategory(@PathVariable(value = "id") int id, Model model) {

		Category category = categoryDAO.getCategoryById(id);
		categoryDAO.deleteCategory(category);
		return "redirect:/getAllCategories";

	}

	// displays all the categories 
	@RequestMapping(value = "/getAllCategories")
	public ModelAndView getAllCategories() {
		List<Category> allcategories = categoryDAO.getAllCategories();
		ModelAndView mv = new ModelAndView("category", "categoryList", allcategories);
		return mv;
	}

	// edit category get method
	@RequestMapping(value = "/manage_category_edit/{id}", method = RequestMethod.GET)
	public ModelAndView getEditCategoryForm(@PathVariable(value = "id") int id) {

		Category category = this.categoryDAO.getCategoryById(id);
		return new ModelAndView("editCategoryForm", "editCategoryObj", category);
	}

	// edit category post method
	@RequestMapping(value = "/manage_category_edit", method = RequestMethod.POST)
	public String editCategory(@ModelAttribute(value = "editCategoryObj") Category category, Model model) {
		this.categoryDAO.updateCategory(category);
		return "redirect:/getAllCategories";

	}

}
