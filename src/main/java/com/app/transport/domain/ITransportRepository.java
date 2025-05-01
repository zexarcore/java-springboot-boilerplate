package com.app.transport.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransportRepository extends JpaRepository<Transport, Long> {
    boolean existsByDurationAndPrice(String name, Double duration);
    // Get all (already provided by JpaRepository)
    @Override
    @NonNull
    List<Transport> findAll();

    // Search by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<Transport> findById(@NonNull Long id);

    // Save a user (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends Transport> S save(@NonNull S transpor);

    // Check if a user with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete user by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);
}