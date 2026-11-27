package com.ecommerce.modules.identity.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.modules.identity.entity.Users;
import com.ecommerce.util.Status;

public interface UsersRepository extends JpaRepository<Users, UUID>{

	Users findByEmail(String email);
	Users findByPhone(Long phone);
	List<Users> findByStatus(Status status);
	
}
