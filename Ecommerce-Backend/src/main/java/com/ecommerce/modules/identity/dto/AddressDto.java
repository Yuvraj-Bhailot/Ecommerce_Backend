package com.ecommerce.modules.identity.dto;

import java.util.UUID;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

	private UUID id;
	private String userName;
	@NotNull
	@NotBlank
	private String houseNumber;
	@NotNull
	@NotBlank
	private String area;
	@NotNull
	@NotBlank
	private String city;
	@NotNull
	@NotBlank
	private String state;
	private String country;
	@NotNull
	@NotBlank
	@Digits(integer = 6, fraction = 0)
	private Integer pincode;
	
}
