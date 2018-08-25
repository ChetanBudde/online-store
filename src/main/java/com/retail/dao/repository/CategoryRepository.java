package com.retail.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.retail.dao.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}