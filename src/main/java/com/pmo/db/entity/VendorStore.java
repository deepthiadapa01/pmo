package com.pmo.db.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vendor_store")
public class VendorStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long storeId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "store_name", nullable = false)
    private String vendorStoreName;

    @Column(name = "store_description", columnDefinition = "TEXT")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "store_address_id", nullable = false)
    private Address address;

    @Column(name = "cuisine_type")
    private String cuisineType;

    @Column(name = "opening_hours")
    private java.time.LocalDateTime openingHours;

    @Column(name = "closing_hours")
    private java.time.LocalDateTime closingHours;

    @Column(name = "store_image")
    private String storeImage;

    @Column(name = "verified_status")
    private Boolean verifiedStatus;

    @Column(name = "store_phn")
    private Integer storePhoneNumber;

    @Column(name = "store_map_link", length = 500)
    private String storeMapLink;

    @Column(name = "store_status", length = 25)
    private String storeStatus;

    // Add getter and setter methods

 // Builder method to convert from entity to DTO
//    public VendorStoreDTO toDTO() {
//        return VendorStoreDTO.builder()
//               // .storeId(this.storeId)
//                .user(this.user.getUserId()) // Assuming there's a getId() method in the User entity
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
