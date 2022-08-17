package com.fms.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.fms.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, String>{

	User findByUserId(String userId);
	
}
