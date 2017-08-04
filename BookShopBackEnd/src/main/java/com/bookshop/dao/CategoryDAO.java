package com.bookshop.dao;

import java.util.List;

import com.bookshop.model.Category;

public interface CategoryDAO {

	public  boolean insertCategory(Category category);

	public void  updateCategory(Category category);

	public void deleteCategory(Category category);

	public Category getCategoryById(int id);

	public List<Category> getAllCategories();

}
