package com.app.itineraries.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;
import com.app.itineraries.domain.IItinerarieRepository;
import com.app.itineraries.domain.IItinerarieService;
import com.app.itineraries.domain.Itinerarie;

@Service
public class ItinerarieService implements IItinerarieService {

    private final IItinerarieRepository itinerarieRepository;

    public ItinerarieService(IItinerarieRepository itinerarieRepository) {
        this.itinerarieRepository = itinerarieRepository;
    }

    @Override
    public List<Itinerarie> findAll() {
        return itinerarieRepository.findAll();
    }

    @Override
    public Itinerarie findById(Long id) {
        return itinerarieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Itinerario no encontrado con ID: " + id));
    }

    @Override
@Transactional
public Itinerarie save(Itinerarie itinerarie) {
    boolean yaExiste = itinerarieRepository.existsByNameAndCreationDate(
        itinerarie.getName(),
        itinerarie.getCreationDate()
    );

    if (yaExiste) {
        throw new IllegalArgumentException("Ya existe un itinerario con ese nombre y destino.");
    }

    return itinerarieRepository.save(itinerarie);
}


    @Override
    @Transactional
    public Itinerarie update(Itinerarie updatedItinerarie, Long id) {
        Itinerarie existingItinerarie = findById(id);
        existingItinerarie.setName(updatedItinerarie.getName());
        existingItinerarie.setCreation_date(updatedItinerarie.getCreation_date());
        // Agrega otros campos que tengas en tu entidad
        return itinerarieRepository.save(existingItinerarie);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Itinerarie itinerarie = findById(id);
        itinerarieRepository.delete(itinerarie);
    }
}
