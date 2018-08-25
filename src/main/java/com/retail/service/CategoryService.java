package com.retail.service;

import java.util.List;

import com.retail.dao.entity.Category;

public interface CategoryService {

	Category getCategory(Long categoryId);
	
	List<Category> getCategoryList();
	
	int updateCategory();
	
	Category createCategory(Category category);
}
