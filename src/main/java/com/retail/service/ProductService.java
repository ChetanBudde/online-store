package com.retail.service;

import java.util.List;

import com.retail.dao.entity.Product;

public interface ProductService {
	
	Product getProduct(Long productId);
	
	List<Product> getProductList();
	
	List<Product> getProductList(Long categoryId);
	
	int updateProduct();
	
	Product createProduct(Product product);
}
