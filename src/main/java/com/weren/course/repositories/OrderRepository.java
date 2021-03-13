package com.weren.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weren.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
