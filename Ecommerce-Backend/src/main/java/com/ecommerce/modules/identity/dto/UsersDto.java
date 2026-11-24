package com.ecommerce.modules.identity.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ecommerce.util.Status;
import com.ecommerce.util.UserRole;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersDto {

	private UUID id;
	@Email
	@NotNull
	@NotBlank
	private String email;
	@NotNull
	@NotBlank
	private String passwordHash;
	@NotNull
	@NotBlank	
	private String name;
	@Digits(integer = 10, fraction = 0)
	@Min(6000000000L)
	private Long phone;
	private Status status;
	private LocalDateTime emailVerifiedAt;
	private LocalDateTime createdAt;
	private LocalDateTime updateAt;
	private UserRole userRole;
	
}
