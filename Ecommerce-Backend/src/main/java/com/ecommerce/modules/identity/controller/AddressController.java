package com.ecommerce.modules.identity.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.modules.identity.dto.AddressDto;
import com.ecommerce.modules.identity.service.AddressService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AddressController {

	private final AddressService addressService;

	@PatchMapping("updateAddress")
	public ResponseEntity<Void> updateAddress(@RequestBody AddressDto addressDto) {
		return addressService.updateAddress(addressDto);
	}

	@DeleteMapping("removeAddress")
	public ResponseEntity<Void> removeAddress(@RequestParam("id") UUID id) {
		return addressService.removeAddress(id);
	}

	@GetMapping("getAddressById")
	public ResponseEntity<AddressDto> getAddressById(@RequestParam("id") UUID id) {
		return addressService.getAddressById(id);
	}

	@GetMapping("getAllAddress")
	public ResponseEntity<List<AddressDto>> getAllAddress() {
		return addressService.getAllAddress();
	}

}
