package com.app.destinations.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;

import com.app.destinations.domain.IDestinationRepository;
import com.app.destinations.domain.IDestinationService;
import com.app.destinations.domain.Destination;

@Service
public class DestinationService implements IDestinationService {

    private final IDestinationRepository destinationRepository;

    public DestinationService(IDestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @Override
    public List<Destination> findAll() {
        return destinationRepository.findAll();
    }

    @Override
    public Destination findById(Long id) {
        return destinationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Destino no encontrado con ID: " + id));
    }

    @Override
@Transactional
public Destination save(Destination destination) {
    boolean yaExiste = destinationRepository.existsByNameAndLocation(
        destination.getName(),
        destination.getLocation()
    );

    if (yaExiste) {
        throw new IllegalArgumentException("Ya existe un destino con ese nombre y país.");
    }

    return destinationRepository.save(destination);
}


    @Override
    @Transactional
    public Destination update(Destination updatedDestination, Long id) {
        Destination existingDestination = findById(id);
        existingDestination.setName(updatedDestination.getName());
        existingDestination.setLocation(updatedDestination.getLocation());
        existingDestination.setDescription(updatedDestination.getDescription());
        // otros campos si tienes
        return destinationRepository.save(existingDestination);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Destination destination = findById(id);
        destinationRepository.delete(destination);
    }
}

