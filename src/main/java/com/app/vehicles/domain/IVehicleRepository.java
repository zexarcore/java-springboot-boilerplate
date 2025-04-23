package com.app.vehicles.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Long> {

    
    @Override
    @NonNull
    List<Vehicle> findAll();

    
    @Override
    @NonNull
    Optional<Vehicle> findById(@NonNull Long id);

    
    @Override
    @NonNull
    <S extends Vehicle> S save(@NonNull S vehicle);

   
    @Override
    boolean existsById(@NonNull Long id);

    
    @Override
    void deleteById(@NonNull Long id);

    

   
    boolean existsByPlate(String plate);
}
