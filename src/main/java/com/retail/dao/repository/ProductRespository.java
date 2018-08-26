package com.retail.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.retail.dao.entity.Product;

@Repository
public interface ProductRespository extends JpaRepository<Product, Long>{

}
