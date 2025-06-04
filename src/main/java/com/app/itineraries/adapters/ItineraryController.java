package com.app.itineraries.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.itineraries.domain.IItinerarieService;
import com.app.itineraries.domain.Itinerarie;

@RestController
@RequestMapping("/api/itineraries")
public class ItineraryController {

    private final IItinerarieService itineraryService;

    public ItineraryController(IItinerarieService itineraryService) {
        this.itineraryService = itineraryService;
    }

    // Obtener todos los itinerarios
    @GetMapping
    public ResponseEntity<List<Itinerarie>> getAllItineraries() {
        List<Itinerarie> itineraries = itineraryService.findAll();
        return ResponseEntity.ok(itineraries);
    }

    // Obtener un itinerario por ID
    @GetMapping("/{id}")
    public ResponseEntity<Itinerarie> getItineraryById(@PathVariable Long id) {
        Itinerarie itinerary = itineraryService.findById(id);
        return ResponseEntity.ok(itinerary);
    }

    // Crear un nuevo itinerario
    @PostMapping
    public ResponseEntity<Itinerarie> createItinerary(@RequestBody Itinerarie itinerary) {
        Itinerarie newItinerary = itineraryService.save(itinerary);
        return ResponseEntity.status(201).body(newItinerary);
    }

    // Actualizar un itinerario existente
    @PutMapping("/{id}")
    public ResponseEntity<Itinerarie> updateItinerary(@PathVariable Long id, @RequestBody Itinerarie itinerary) {
        Itinerarie updatedItinerary = itineraryService.update(itinerary, id);
        return ResponseEntity.ok(updatedItinerary);
    }

    // Eliminar un itinerario por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItinerary(@PathVariable Long id) {
        itineraryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
