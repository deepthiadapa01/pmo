package com.pmo.users.jpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pmo.db.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // You can add custom query methods here if needed
    // For example, find a user by username
    User findByUserName(String username);
}
