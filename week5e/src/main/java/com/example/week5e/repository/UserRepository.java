package com.example.week5e.repository;

import com.example.week5e.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Standard CRUD abstractions (save, findAll, findById, deleteById) are extended implicitly
}