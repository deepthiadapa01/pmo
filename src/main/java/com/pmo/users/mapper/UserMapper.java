package com.pmo.users.mapper;

import com.pmo.db.entity.User;
import com.pmo.users.dto.UserDTO;

public class UserMapper {

	// Method to convert UserDTO to User entity
	public static User toEntity(UserDTO userDTO) {
		User user = new User();
		user.setUserId(userDTO.getUserId());
		user.setUserName(userDTO.getUserName());
		user.setEmail(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		user.setUserType(userDTO.getUserType());
		user.setRegistrationDate(userDTO.getRegistrationDate());
		user.setUserCreatedTimestamp(userDTO.getUserCreatedTimestamp());
		user.setCustomerPhoneNumber(userDTO.getCustomerPhoneNumber());
		user.setVerifiedStatus(userDTO.getVerifiedStatus());
		// Additional mappings if needed
		return user;
	}
	
	// Method to convert UserDTO to User entity
		public static UserDTO toDTO(User user) {
			UserDTO userDto = new UserDTO();
			userDto.setUserId(user.getUserId());
			userDto.setUserName(user.getUserName());
			userDto.setEmail(user.getEmail());
			userDto.setPassword(user.getPassword());
			userDto.setUserType(user.getUserType());
			userDto.setRegistrationDate(user.getRegistrationDate());
			userDto.setUserCreatedTimestamp(user.getUserCreatedTimestamp());
			userDto.setCustomerPhoneNumber(user.getCustomerPhoneNumber());
			userDto.setVerifiedStatus(user.getVerifiedStatus());
			// Additional mappings if needed
			return userDto;
		}

	
}
