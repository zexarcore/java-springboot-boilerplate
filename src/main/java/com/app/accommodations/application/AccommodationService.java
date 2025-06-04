package com.app.accommodations.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;

import com.app.accommodations.domain.IAccommodationRepository;
import com.app.accommodations.domain.IAccommodationService;
import com.app.accommodations.domain.Accommodation;

@Service
public class AccommodationService implements IAccommodationService {
    
    private final IAccommodationRepository accommodationRepository;

    public AccommodationService(IAccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    // Buscar todos
    @Override
    public List<Accommodation> findAll() {
        return accommodationRepository.findAll();
    }

    // Buscar por ID
    @Override
    public Accommodation findById(Long id) {
        return accommodationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Accommodation not found with ID: " + id));
    }

    // Guardar
    @Override
    @Transactional
    public Accommodation save(Accommodation accommodation) {
        boolean yaExiste = accommodationRepository.existsByNameAndAddress(accommodation.getName(), accommodation.getAddress());

        if (yaExiste) {
            throw new IllegalArgumentException("Ya existe un alojamiento con ese nombre y dirección.");
        }

        return accommodationRepository.save(accommodation);
    }

    // Actualizar
    @Override
    @Transactional
    public Accommodation update(Accommodation updatedAccommodation, Long id) {
        Accommodation existingAccommodation = findById(id);
        existingAccommodation.setName(updatedAccommodation.getName());
        existingAccommodation.setAddress(updatedAccommodation.getAddress());
        existingAccommodation.setType(updatedAccommodation.getType());
        existingAccommodation.setPrice_per_night(updatedAccommodation.getPrice_per_night());

        return accommodationRepository.save(existingAccommodation);
    }

    // Borrar por ID
    @Override
    @Transactional
    public void deleteById(Long id) {
        Accommodation accommodation = findById(id);
        accommodationRepository.delete(accommodation);
    }
}

