package com.ecommerce.modules.identity.service;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;

import com.ecommerce.modules.identity.dto.AddressDto;

public interface AddressService {
	
	public ResponseEntity<Void> updateAddress(AddressDto addressDto);

	public ResponseEntity<Void> removeAddress(UUID id);

	public ResponseEntity<AddressDto> getAddressById(UUID id);

	public ResponseEntity<List<AddressDto>> getAllAddress();
	
}
