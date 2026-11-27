package com.ecommerce.modules.identity.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ecommerce.util.Status;
import com.ecommerce.util.UserRole;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(name = "password_hash")
	private String passwordHash;
	private String name;
	@Column(unique = true)
	private Long phone;
	@Enumerated(EnumType.STRING)
	private Status status;
	@Column(name = "email_verified_at")
	private LocalDateTime emailVerifiedAt;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column(name = "update_at")
	private LocalDateTime updateAt;
	@Column(name = "user_role", nullable = false)
	@Enumerated(EnumType.STRING)
	private UserRole userRole;
	
	@OneToOne(cascade = CascadeType.ALL)
	@Column(name = "user_address_id")
	private Address address;
	
}
