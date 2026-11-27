package com.ecommerce.modules.catalog.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ecommerce.util.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product_variants")

public class ProductVariant {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Products product;

	@Column(nullable = false, unique = true)
	private String sku;

	@Column(nullable = false)
	private String barcode;

	@Column(nullable = false)
	private String currency;

	@Column(name = "unit_price_minor", nullable = false)
	private Long unitPriceMinor;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Status status;

	@Column(name = "created_at", nullable = false)
	private LocalDateTime createdAt;

}