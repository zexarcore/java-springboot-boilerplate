package com.app.itineraries.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.itineraries.domain.IItinerarieRepository;
import com.app.itineraries.domain.Itinerarie;

@Component
public class ItinerarieDatasource {

    private final IItinerarieRepository itinerarieRepository;

    public ItinerarieDatasource(IItinerarieRepository itinerarieRepository) {
        this.itinerarieRepository = itinerarieRepository;
    }

    public List<Itinerarie> findAll() {
        return itinerarieRepository.findAll();
    }
    public Optional<Itinerarie> findById(Long id) {
        return itinerarieRepository.findById(id);
    }

    public Itinerarie save(Itinerarie itinerarie) {
        return itinerarieRepository.save(itinerarie);
    }

    public Optional<Itinerarie> update(Itinerarie itinerarie, Long id) {
        return itinerarieRepository.findById(id).map(existingUser -> {
            existingUser.setId(itinerarie.getId());
            existingUser.setUsers_Id(itinerarie.getUsers_Id());
            existingUser.setName(itinerarie.getName());
            existingUser.setCreation_date(itinerarie.getCreation_date());
            return itinerarieRepository.save(existingUser);
        });
    }

    public boolean deleteById(Long id) {
        if (itinerarieRepository.existsById(id)) {
            itinerarieRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
