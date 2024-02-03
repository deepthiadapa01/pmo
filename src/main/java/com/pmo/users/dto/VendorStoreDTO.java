package com.pmo.users.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VendorStoreDTO {
	
    private UserDTO userDto;
    @JsonIgnore
    private Long storeId;
    private String vendorStoreName;
    private String description;
    private AddressDTO addressDto;
    private String cuisineType;
    private java.time.LocalDateTime openingHours;
    private java.time.LocalDateTime closingHours;
    private String storeImage;
    private Boolean verifiedStatus;
    private Integer storePhoneNumber;
    private String storeMapLink;
    private String storeStatus;

//    public VendorStore toEntity() {
//        return VendorStore.builder()
//               // .storeId(this.storeId)
//                .user(this.user.getUser()) // Assuming there's a getId() method in the User entity
//                .vendorStoreName(this.vendorStoreName)
//                .description(this.description)
//                .address(this.address.getAddressId()) // Assuming there's a getAddressId() method in the Address entity
//                .cuisineType(this.cuisineType)
//                .openingHours(this.openingHours)
//                .closingHours(this.closingHours)
//                .storeImage(this.storeImage)
//                .verifiedStatus(this.verifiedStatus)
//                .storePhoneNumber(this.storePhoneNumber)
//                .storeMapLink(this.storeMapLink)
//                .storeStatus(this.storeStatus)
//                .build();
//    }
    
}
