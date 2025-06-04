package com.app.itineraries.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IItinerarieRepository extends JpaRepository<Itinerarie, Long> {
    boolean existsByNameAndCreationDate(String name, String creationDate);


    // Get all users (already provided by JpaRepository)
    @Override
    @NonNull
    List<Itinerarie> findAll();

    // Search user by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<Itinerarie> findById(@NonNull Long id);

    // Save a user (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends Itinerarie> S save(@NonNull S itinerarie);

    // Check if a user with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete user by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);
}