package com.retail.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.dao.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}