package com.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.retail.DTO.ProductRequest;
import com.retail.dao.entity.Category;
import com.retail.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value="/category", method=RequestMethod.POST )
	public Category createCategory(@RequestBody ProductRequest productRequest) {
		
		return null;
	}
}
