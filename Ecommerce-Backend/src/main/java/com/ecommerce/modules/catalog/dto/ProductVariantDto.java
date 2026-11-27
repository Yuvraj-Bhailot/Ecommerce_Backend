package com.ecommerce.modules.catalog.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ecommerce.util.Status;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVariantDto {

	private UUID id;
	private UUID productId;
	@NotNull
	@NotBlank
	private String sku;
	private String barcode;
	@NotNull
	@NotBlank
	private String currency;	
	@NotNull
	private Long unitPriceMinor;
	private Status status;
	private LocalDateTime createdAt;

}