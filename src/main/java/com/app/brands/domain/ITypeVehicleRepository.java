<<<<<<<< HEAD:src/main/java/com/app/brands/domain/ITypeVehicleRepository.java
package com.app.typevehicles.domain;
========
package com.app.brands.domain;
>>>>>>>> master:src/main/java/com/app/brands/domain/IBrandRepository.java

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<<< HEAD:src/main/java/com/app/brands/domain/ITypeVehicleRepository.java
public interface ITypeVehicleRepository extends JpaRepository<TypeVehicle, Long> {
========
public interface IBrandRepository extends JpaRepository<Brand, Long> {
>>>>>>>> master:src/main/java/com/app/brands/domain/IBrandRepository.java

    // Get all TypeVehicles (already provided by JpaRepository)
    @Override
    @NonNull
<<<<<<<< HEAD:src/main/java/com/app/brands/domain/ITypeVehicleRepository.java
    List<TypeVehicle> findAll();
========
    List<Brand> findAll();
>>>>>>>> master:src/main/java/com/app/brands/domain/IBrandRepository.java

    // Search user by ID (already provided by JpaRepository)
    @Override
    @NonNull
<<<<<<<< HEAD:src/main/java/com/app/brands/domain/ITypeVehicleRepository.java
    Optional<TypeVehicle> findById(@NonNull Long id);
========
    Optional<Brand> findById(@NonNull Long id);
>>>>>>>> master:src/main/java/com/app/brands/domain/IBrandRepository.java

    // Save a user (already provided by JpaRepository)
    @Override
    @NonNull
<<<<<<<< HEAD:src/main/java/com/app/brands/domain/ITypeVehicleRepository.java
    <S extends TypeVehicle> S save(@NonNull S user);
========
    <S extends Brand> S save(@NonNull S brand);
>>>>>>>> master:src/main/java/com/app/brands/domain/IBrandRepository.java

    // Check if a user with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete user by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);

<<<<<<<< HEAD:src/main/java/com/app/brands/domain/ITypeVehicleRepository.java
    
========
    // Additional application-specific methods:

    // Search for a user by their email
    Optional<Brand> findByEmail(String email);

    // Check if an email is already registered
    boolean existsByEmail(String email);
>>>>>>>> master:src/main/java/com/app/brands/domain/IBrandRepository.java
}