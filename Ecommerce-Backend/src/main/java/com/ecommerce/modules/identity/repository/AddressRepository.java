package com.ecommerce.modules.identity.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.modules.identity.entity.Address;

public interface AddressRepository extends JpaRepository<Address, UUID>{

}
