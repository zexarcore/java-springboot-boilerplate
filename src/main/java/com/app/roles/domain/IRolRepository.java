package com.app.roles.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Long> {

    
    @Override
    @NonNull
    List<Rol> findAll();


    @Override
    @NonNull
    Optional<Rol> findById(@NonNull Long id);

   
    @Override
    @NonNull
    <S extends Rol> S save(@NonNull S rol);


    @Override
    boolean existsById(@NonNull Long id);


    @Override
    void deleteById(@NonNull Long id);

    Optional<Rol> findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByName(String name);
}