package com.app.accommodations.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.accommodations.domain.IAccommodationRepository;
import com.app.accommodations.domain.Accommodation;

@Component
public class AccommodationDatasource {

    private final IAccommodationRepository accommodationRepository;

    public AccommodationDatasource(IAccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    public List<Accommodation> findAll() {
        return accommodationRepository.findAll();
    }
    public Optional<Accommodation> findById(Long id) {
        return accommodationRepository.findById(id);
    }

    public Accommodation save(Accommodation accommodation) {
        return accommodationRepository.save(accommodation);
    }

    public Optional<Accommodation> update(Accommodation accommodation, Long id) {
        return accommodationRepository.findById(id).map(existingaccommodation -> {
            existingaccommodation.setName(accommodation.getName());
            existingaccommodation.setDestination_id(accommodation.getDestination_id());
            existingaccommodation.setType(accommodation.getType());
            existingaccommodation.setAddress(accommodation.getAddress());
            existingaccommodation.setPrice_per_night(accommodation.getPrice_per_night());
            return accommodationRepository.save(existingaccommodation);
        });
    }

    public boolean deleteById(Long id) {
        if (accommodationRepository.existsById(id)) {
            accommodationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
