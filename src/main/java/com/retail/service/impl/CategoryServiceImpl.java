package com.retail.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.dao.entity.Category;
import com.retail.dao.repository.CategoryRepository;
import com.retail.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category getCategory(Long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCategory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

}
