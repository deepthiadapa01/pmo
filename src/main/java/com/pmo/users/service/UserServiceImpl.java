package com.pmo.users.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmo.db.entity.User;
import com.pmo.users.jpa.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.orElse(null);
    }

    public User createUser(User user) {
        // You may want to perform additional validation or business logic here
        return userRepository.save(user);
    }

    public User updateUser(Long userId, User updatedUser) {
        Optional<User> optionalExistingUser = userRepository.findById(userId);

        if (optionalExistingUser.isPresent()) {
            User existingUser = optionalExistingUser.get();

            // Update fields based on your requirements
          //  existingUser.setUsername(updatedUser.getUsername());
            existingUser.setEmail(updatedUser.getEmail());
            // ... update other fields

            return userRepository.save(existingUser);
        } else {
            return null; // User not found
        }
    }

    public boolean deleteUser(Long userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return true;
        } else {
            return false; // User not found
        }
    }
}
