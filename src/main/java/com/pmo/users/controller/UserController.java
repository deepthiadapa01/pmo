package com.pmo.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmo.db.entity.User;
import com.pmo.users.dto.UserDTO;
import com.pmo.users.service.UserServiceImpl;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserServiceImpl userService;

	@Autowired
	public UserController(UserServiceImpl userService) {
		this.userService = userService;
	}

	// Get all users
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userService.getAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	// Get user by ID
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable Long userId) {
		User user = userService.getUserById(userId);
		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Create a new user
	@PostMapping("/createUsers")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {

		User user = User.builder().userId(userDTO.getUserId()).userName(userDTO.getUserName()).email(userDTO.getEmail())
				.password(userDTO.getPassword()).userType(userDTO.getUserType())
				.registrationDate(userDTO.getRegistrationDate()).userCreatedTimestamp(userDTO.getUserCreatedTimestamp())
				.customerPhoneNumber(userDTO.getCustomerPhoneNumber()).verifiedStatus(userDTO.getVerifiedStatus())
				.build();
		userService.createUser(user);
		return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
	}

	// Update an existing user
	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody User updatedUser) {
		User user = userService.updateUser(userId, updatedUser);
		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Delete a user
	@DeleteMapping("/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
		boolean deleted = userService.deleteUser(userId);
		if (deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
