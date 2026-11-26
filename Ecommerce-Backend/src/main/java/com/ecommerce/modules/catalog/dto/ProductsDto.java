package com.ecommerce.modules.catalog.dto;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.Locale.Category;

import com.ecommerce.util.Status;

import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductsDto {
	
	private UUID id;
	private UUID sellerId;
	@NotNull
	@NotBlank
	private String title;
	private String description;
	private Status status;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private UUID categoryId;

}