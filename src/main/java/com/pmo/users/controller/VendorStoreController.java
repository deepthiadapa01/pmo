package com.pmo.users.controller;
import com.pmo.users.dto.VendorStoreDTO;
import com.pmo.users.service.impl.VendorStoreServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendor-stores")
public class VendorStoreController {

   
    private static final Logger logger = LoggerFactory.getLogger(VendorStoreController.class);

    @Autowired
    private VendorStoreServiceImpl vendorStoreService;

    // Get vendor store by ID
    @GetMapping("/{username}")
    public ResponseEntity<VendorStoreDTO> getVendorStoreById(@PathVariable String username) {
    	logger.info("Fetching the user");
        VendorStoreDTO vendorStore = vendorStoreService.getVendorStoreByUserName(username); 
        return vendorStore != null ?
                new ResponseEntity<>(vendorStore, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Create a new vendor store
    @PostMapping("/newstore")
    public ResponseEntity<VendorStoreDTO> createVendorStore(@RequestBody VendorStoreDTO vendorStoreDTO) {
        VendorStoreDTO createdVendorStore = vendorStoreService.createVendorStore(vendorStoreDTO);
        return new ResponseEntity<>(createdVendorStore, HttpStatus.CREATED);
    }

//    // Update an existing vendor store
    @PutMapping("/updatestore")
    public ResponseEntity<VendorStoreDTO> updateVendorStore(@RequestBody VendorStoreDTO vendorStoreDTO) {
        VendorStoreDTO updatedVendorStore = vendorStoreService.updateVendorStore(vendorStoreDTO);
        return updatedVendorStore != null ?
                new ResponseEntity<>(updatedVendorStore, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    // Delete a vendor store by ID
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteVendorStore(@PathVariable Long id) {
//        boolean deleted = vendorStoreService.deleteVendorStore(id);
//        return deleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
}
