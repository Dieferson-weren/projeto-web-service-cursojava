package com.weren.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weren.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
