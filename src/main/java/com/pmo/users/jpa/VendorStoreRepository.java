package com.pmo.users.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pmo.db.entity.User;
import com.pmo.db.entity.VendorStore;

@Repository
public interface VendorStoreRepository extends JpaRepository<VendorStore, Long>{
	
	public VendorStore getVendorStoreByUser_UserName(String userName);

}
