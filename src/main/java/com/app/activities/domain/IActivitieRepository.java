package com.app.activities.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IActivitieRepository extends JpaRepository<Activitie, Long> {

    boolean existsByNameAndPrice(String name, Double price);

    // Obtener todas las actividades (ya proporcionado por JpaRepository)
    @Override
    @NonNull
    List<Activitie> findAll();

    // Buscar actividad por ID (ya proporcionado por JpaRepository)
    @Override
    @NonNull
    Optional<Activitie> findById(@NonNull Long id);

    // Guardar una actividad (ya proporcionado por JpaRepository)
    @Override
    @NonNull
    <S extends Activitie> S save(@NonNull S activitie);

    // Verificar si existe una actividad con un ID específico (ya proporcionado por JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Eliminar actividad por ID (ya proporcionado por JpaRepository)
    @Override
    void deleteById(@NonNull Long id);
}