package com.pmo.users.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmo.db.entity.VendorStore;

import com.pmo.users.dto.VendorStoreDTO;
import com.pmo.users.jpa.VendorStoreRepository;
import com.pmo.users.mapper.VendorStoreMapper;
import com.pmo.users.service.IVendorStoreService;

@Service
public class VendorStoreServiceImpl implements IVendorStoreService {

	@Autowired
	public VendorStoreRepository storeRepo;

	@Override
	public VendorStoreDTO getVendorStoreByUserName(String userName) {
		VendorStore store = storeRepo.getVendorStoreByUser_UserName(userName);
		return VendorStoreMapper.toDTO(store);
	}

	@Override
	public VendorStoreDTO createVendorStore(VendorStoreDTO vendorStoreDto) {
		VendorStore vendorStore=VendorStoreMapper.toEntity(vendorStoreDto);
		storeRepo.save(vendorStore);
		return vendorStoreDto;
	}

	@Override
	public VendorStoreDTO updateVendorStore(VendorStoreDTO vendorStoreDTO) {
		VendorStore vendorStore=VendorStoreMapper.toEntity(vendorStoreDTO);
		storeRepo.save(vendorStore);
		return vendorStoreDTO;
	}

	
}
