package com.pmo.users.mapper;

import com.pmo.db.entity.Address;
import com.pmo.users.dto.AddressDTO;

public class AddressMapper {

	public static Address toEntity(AddressDTO addressDTO) {
		Address address = new Address();
		address.setAddressId(addressDTO.getAddressId());
		address.setUser(UserMapper.toEntity(addressDTO.getUserDTO()));
		address.setAddressLine1(addressDTO.getAddressLine1());
		address.setAddressLine2(addressDTO.getAddressLine2());
		address.setCity(addressDTO.getCity());
		address.setState(addressDTO.getState());
		address.setPincode(addressDTO.getPincode());
		address.setLatLon(addressDTO.getLatLon());
		return address;
	}

	// Entity to DTO mapper
	public static AddressDTO toDto(Address address) {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setAddressId(address.getAddressId());
		addressDTO.setUserDTO(UserMapper.toDTO(address.getUser()));
		addressDTO.setAddressLine1(address.getAddressLine1());
		addressDTO.setAddressLine2(address.getAddressLine2());
		addressDTO.setCity(address.getCity());
		addressDTO.setState(address.getState());
		addressDTO.setPincode(address.getPincode());
		addressDTO.setLatLon(address.getLatLon());
		return addressDTO;
	}

}
