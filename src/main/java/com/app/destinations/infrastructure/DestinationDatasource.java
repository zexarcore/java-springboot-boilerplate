package com.app.destinations.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.destinations.domain.IDestinationRepository;
import com.app.destinations.domain.Destination;

@Component
public class DestinationDatasource {

    private final IDestinationRepository destinationRepository;

    public DestinationDatasource(IDestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    public List<Destination> findAll() {
        return destinationRepository.findAll();
    }
    public Optional<Destination> findById(Long id) {
        return destinationRepository.findById(id);
    }

    public Destination save(Destination destination) {
        return destinationRepository.save(destination);
    }

    public Optional<Destination> update(Destination destination, Long id) {
        return destinationRepository.findById(id).map(existingUser -> {
            existingUser.setId(destination.getId());
            existingUser.setName(destination.getName());
            existingUser.setDescription(destination.getDescription());
            existingUser.setLocation(destination.getLocation());
            return destinationRepository.save(existingUser);
        });
    }

    public boolean deleteById(Long id) {
        if (destinationRepository.existsById(id)) {
            destinationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
