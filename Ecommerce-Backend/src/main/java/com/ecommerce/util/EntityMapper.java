package com.ecommerce.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.ecommerce.modules.catalog.dto.ProductsDto;
import com.ecommerce.modules.catalog.entity.Products;
import com.ecommerce.modules.identity.dto.AddressDto;
import com.ecommerce.modules.identity.dto.UsersDto;
import com.ecommerce.modules.identity.entity.Address;
import com.ecommerce.modules.identity.entity.Users;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EntityMapper {

	private final ModelMapper modelMapper;
	
	public Users convertUsersDtoToEntity(UsersDto usersDto) {
		return modelMapper.map(usersDto, Users.class);
	}
	
	public Address convertAddressDtoToEntity(AddressDto addressDto) {
		return modelMapper.map(addressDto, Address.class);
	}
	
	public UsersDto convertEntityToUsersDto(Users users) {
		return modelMapper.map(users, UsersDto.class);
	}
	
	public AddressDto convertEntityToAddressDto(Address address) {
		return modelMapper.map(address, AddressDto.class);
	}
	
	public Products convertProductDtoToEntity(ProductsDto productsDto) {
		return modelMapper.map(productsDto, Products.class);
	}
	
	public ProductsDto convertEntityToProductDto(Products products) {
		return modelMapper.map(products, ProductsDto.class);
	}
	
}
