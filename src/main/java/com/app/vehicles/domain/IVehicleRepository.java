<<<<<<<< HEAD:src/main/java/com/app/vehicles/domain/IServiceRepository.java
package com.app.services.domain;
========
package com.app.vehicles.domain;
>>>>>>>> master:src/main/java/com/app/vehicles/domain/IVehicleRepository.java

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<<< HEAD:src/main/java/com/app/vehicles/domain/IServiceRepository.java
public interface IServiceRepository extends JpaRepository<Service, Long> {
========
public interface IUserRepository extends JpaRepository<Vehicle, Long> {
>>>>>>>> master:src/main/java/com/app/vehicles/domain/IVehicleRepository.java

    // Get all users (already provided by JpaRepository)
    @Override
    @NonNull
    List<Vehicle> findAll();

    // Search user by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<Vehicle> findById(@NonNull Long id);

    // Save a user (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends Vehicle> S save(@NonNull S vehicle);

    // Check if a user with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete user by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);

    // Additional application-specific methods:

    // Search for a user by their email
    Optional<Vehicle> findByEmail(String email);

    // Check if an email is already registered
    boolean existsByEmail(String email);
}