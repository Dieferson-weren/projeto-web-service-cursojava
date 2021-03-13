package com.weren.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weren.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
