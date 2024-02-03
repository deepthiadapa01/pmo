package com.pmo.users.service;

import java.util.List;

import com.pmo.db.entity.User;

public interface IUserService {

	public List<User> getAllUsers();

	public User getUserById(Long userId);

	public User createUser(User user);

	public User updateUser(Long userId, User updatedUser);

	public boolean deleteUser(Long userId);

}
