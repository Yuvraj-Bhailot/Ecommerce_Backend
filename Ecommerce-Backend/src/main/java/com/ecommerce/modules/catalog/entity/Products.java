package com.ecommerce.modules.catalog.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.Locale.Category;

import com.ecommerce.modules.identity.entity.Seller;
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
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "seller_id", nullable = false)
	private Seller seller;

	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false, unique = true, length = 260)
	private String slug;

	private String description;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Status status;

	@Column(name = "created_at", nullable = false)
	private LocalDateTime createdAt;

	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;

	@ManyToOne
	private Category category;
}