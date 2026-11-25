package com.ecommerce.modules.identity.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "house_number")
	private String houseNumber;
	private String area;
	private String city;
	private String state;
	private String country;
	private Integer pincode;
	
}
