package com.pmo.users.mapper;


import com.pmo.db.entity.VendorStore;
import com.pmo.users.dto.VendorStoreDTO;

public class VendorStoreMapper {
	
	public static VendorStoreDTO toDTO(VendorStore vendorStore) {
		VendorStoreDTO vendorStoreDTO = new VendorStoreDTO();
		vendorStoreDTO.setStoreId(vendorStore.getStoreId());
		vendorStoreDTO.setUserDto(UserMapper.toDTO(vendorStore.getUser()));
		vendorStoreDTO.setVendorStoreName(vendorStore.getVendorStoreName());
		vendorStoreDTO.setDescription(vendorStore.getDescription());
		vendorStoreDTO.setAddressDto(AddressMapper.toDto(vendorStore.getAddress()));
		vendorStoreDTO.setCuisineType(vendorStore.getCuisineType());
		vendorStoreDTO.setOpeningHours(vendorStore.getOpeningHours());
		vendorStoreDTO.setClosingHours(vendorStore.getClosingHours());
		vendorStoreDTO.setStoreImage(vendorStore.getStoreImage());
		vendorStoreDTO.setVerifiedStatus(vendorStore.getVerifiedStatus());
		vendorStoreDTO.setStorePhoneNumber(vendorStore.getStorePhoneNumber());
		vendorStoreDTO.setStoreMapLink(vendorStore.getStoreMapLink());
		vendorStoreDTO.setStoreStatus(vendorStore.getStoreStatus());
		return vendorStoreDTO;
	}
	
	public static VendorStore toEntity(VendorStoreDTO vendorStoreDTO) {
        VendorStore vendorStore = new VendorStore();
        vendorStore.setStoreId(vendorStoreDTO.getStoreId());
        vendorStore.setUser(UserMapper.toEntity(vendorStoreDTO.getUserDto()));
        vendorStore.setVendorStoreName(vendorStoreDTO.getVendorStoreName());
        vendorStore.setDescription(vendorStoreDTO.getDescription());
        vendorStore.setAddress(AddressMapper.toEntity(vendorStoreDTO.getAddressDto()));
        vendorStore.setCuisineType(vendorStoreDTO.getCuisineType());
        vendorStore.setOpeningHours(vendorStoreDTO.getOpeningHours());
        vendorStore.setClosingHours(vendorStoreDTO.getClosingHours());
        vendorStore.setStoreImage(vendorStoreDTO.getStoreImage());
        vendorStore.setVerifiedStatus(vendorStoreDTO.getVerifiedStatus());
        vendorStore.setStorePhoneNumber(vendorStoreDTO.getStorePhoneNumber());
        vendorStore.setStoreMapLink(vendorStoreDTO.getStoreMapLink());
        vendorStore.setStoreStatus(vendorStoreDTO.getStoreStatus());
        return vendorStore;
    }
	

}
