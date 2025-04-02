package com.app.users.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Typevehicle, Long> {

    // Get all users (already provided by JpaRepository)
    @Override
    @NonNull
    List<Typevehicle> findAll();

    // Search user by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<Typevehicle> findById(@NonNull Long id);

    // Save a user (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends Typevehicle> S save(@NonNull S user);

    // Check if a user with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete user by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);

    // Additional application-specific methods:

    // Search for a user by their email
    Optional<Typevehicle> findByEmail(String email);

    // Check if an email is already registered
    boolean existsByEmail(String email);
}