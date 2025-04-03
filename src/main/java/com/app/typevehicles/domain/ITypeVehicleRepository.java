package com.app.typevehicles.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeVehicleRepository extends JpaRepository<TypeVehicle, Long> {

    // Get all TypeVehicles (already provided by JpaRepository)
    @Override
    @NonNull
    List<TypeVehicle> findAll();

    // Search user by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<TypeVehicle> findById(@NonNull Long id);

    // Save a user (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends TypeVehicle> S save(@NonNull S user);

    // Check if a user with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete user by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);

    
}