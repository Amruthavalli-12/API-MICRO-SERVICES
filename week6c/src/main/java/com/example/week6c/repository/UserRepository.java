package com.example.week6c.repository;

import com.example.week6c.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Basic pagination and sorting structures are automatically
    // provided by JpaRepository
}