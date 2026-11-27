package com.ecommerce.modules.identity.service;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;

import com.ecommerce.modules.identity.dto.AddressDto;
import com.ecommerce.modules.identity.dto.UsersDto;
import com.ecommerce.util.Status;

public interface UsersService {

	public ResponseEntity<Void> createUser(UsersDto usersDto);
	public ResponseEntity<Void> updateUserDetails(UsersDto usersDto);
	public ResponseEntity<Void> deleteUser(UUID id);
	public ResponseEntity<UsersDto> getUserById(UUID id);
	public ResponseEntity<List<UsersDto>> getAllUsers();
	public ResponseEntity<UsersDto> getUserByEmail(String email);
	public ResponseEntity<UsersDto> getUserByPhone(Long phone);
	public ResponseEntity<List<UsersDto>> getUsersByStatus(Status status);
	
	public ResponseEntity<Void> saveAddress(String email, AddressDto addressDto);
	
}
