package com.pmo.users.service;

import org.springframework.stereotype.Service;

import com.pmo.db.entity.VendorStore;
import com.pmo.users.dto.VendorStoreDTO;


@Service
public interface IVendorStoreService {
	
	public VendorStoreDTO getVendorStoreByUserName(String userName);
	
	public VendorStoreDTO createVendorStore(VendorStoreDTO vendorStoreDto);
	
	public VendorStoreDTO updateVendorStore(VendorStoreDTO vendorStoreDTO);

}
