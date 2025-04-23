package com.app.destinations.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.destinations.domain.IDestinationService;
import com.app.destinations.domain.Destination;

@RestController
@RequestMapping("/api/destinations")
public class DestinationController {

    private final IDestinationService destinationService;

    public DestinationController(IDestinationService destinationService) {
        this.destinationService = destinationService;
    }

    // Obtener todas las destinaciones
    @GetMapping
    public ResponseEntity<List<Destination>> getAllDestinations() {
        List<Destination> destinations = destinationService.findAll();
        return ResponseEntity.ok(destinations);
    }

    // Obtener una destinación por ID
    @GetMapping("/{id}")
    public ResponseEntity<Destination> getDestinationById(@PathVariable Long id) {
        Destination destination = destinationService.findById(id);
        return ResponseEntity.ok(destination);
    }

    // Crear una nueva destinación
    @PostMapping
    public ResponseEntity<Destination> createDestination(@RequestBody Destination destination) {
        Destination newDestination = destinationService.save(destination);
        return ResponseEntity.status(201).body(newDestination);
    }

    // Actualizar una destinación existente
    @PutMapping("/{id}")
    public ResponseEntity<Destination> updateDestination(@PathVariable Long id, @RequestBody Destination destination) {
        Destination updatedDestination = destinationService.update(destination, id);
        return ResponseEntity.ok(updatedDestination);
    }

    // Eliminar una destinación por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDestination(@PathVariable Long id) {
        destinationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}