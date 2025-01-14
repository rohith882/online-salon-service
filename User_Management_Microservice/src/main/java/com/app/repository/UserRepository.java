package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.app.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	// Additional query methods can be defined here if needed
	// For example, finding a user by email if you have an email field
	// Optional<User> findByEmail(String email);
}
