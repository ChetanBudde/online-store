package com.retail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.dao.entity.Product;
import com.retail.dao.repository.ProductRespository;
import com.retail.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRespository productRepository;
	
	@Override
	public Product getProduct(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductList(Long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateProduct() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

}
