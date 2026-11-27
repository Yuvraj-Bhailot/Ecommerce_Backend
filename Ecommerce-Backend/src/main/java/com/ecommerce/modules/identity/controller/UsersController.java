package com.ecommerce.modules.identity.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.modules.identity.dto.AddressDto;
import com.ecommerce.modules.identity.dto.UsersDto;
import com.ecommerce.modules.identity.service.UsersService;
import com.ecommerce.util.Status;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UsersController {

	private final UsersService usersService;

	@PostMapping("/createUser")
	public ResponseEntity<Void> createUser(@Valid @RequestBody UsersDto usersDto) {
		return usersService.createUser(usersDto);
	}

	@PatchMapping("/updateUserDetails")
	public ResponseEntity<Void> updateUserDetails(@RequestBody UsersDto usersDto) {
		return usersService.updateUserDetails(usersDto);
	}

	@DeleteMapping("/deleteUser")
	public ResponseEntity<Void> deleteUser(@RequestParam("id") UUID id) {
		return usersService.deleteUser(id);
	}

	@GetMapping("/getUserById")
	public ResponseEntity<UsersDto> getUserById(@RequestParam("id") UUID id) {
		return usersService.getUserById(id);
	}

	@GetMapping("/getAllUser")
	public ResponseEntity<List<UsersDto>> getAllUsers() {
		return usersService.getAllUsers();
	}

	@GetMapping("/getUserByEmail")
	public ResponseEntity<UsersDto> getUserByEmail(@RequestParam("email") String email) {
		return usersService.getUserByEmail(email);
	}

	@GetMapping("/getUserByPhone")
	public ResponseEntity<UsersDto> getUserByPhone(@RequestParam("phone") Long phone) {
		return usersService.getUserByPhone(phone);
	}

	@GetMapping("/getUsersByStatus")
	public ResponseEntity<List<UsersDto>> getUsersByStatus(@RequestParam("status") Status status) {
		return usersService.getUsersByStatus(status);
	}

	@PutMapping("/saveAddress")
	public ResponseEntity<Void> saveAddress(@RequestParam("email") String email,
			@Valid @RequestBody AddressDto addressDto) {
		return usersService.saveAddress(email, addressDto);
	}

}
