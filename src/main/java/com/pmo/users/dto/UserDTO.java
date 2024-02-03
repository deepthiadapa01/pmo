package com.pmo.users.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pmo.db.entity.UserType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	@JsonIgnore
    private Long userId;
	
    private String userName;
    
    private String email;
    
    private String password;
    
    private UserType userType;
    
    private LocalDateTime registrationDate;
    
    private LocalDateTime userCreatedTimestamp;
    
    private String customerPhoneNumber;
    
    private Boolean verifiedStatus;
    
    // Constructors, getters, and setters

    // You may add other convenience methods or validations here
}
