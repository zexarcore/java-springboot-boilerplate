package com.app.accommodations.adapters;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.accommodations.domain.IAccommodationService;
import com.app.accommodations.domain.Accommodation;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {

    private final IAccommodationService accommodationService;

    public AccommodationController(IAccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    // Get all accommodations
    @GetMapping
    public ResponseEntity<List<Accommodation>> getAllAccommodations() {
        List<Accommodation> accommodations = accommodationService.findAll();
        return ResponseEntity.ok(accommodations);
    }

    // Get accommodation by ID
    @GetMapping("/{id}")
    public ResponseEntity<Accommodation> getAccommodationById(@PathVariable Long id) {
        Accommodation accommodation = accommodationService.findById(id);
        return ResponseEntity.ok(accommodation);
    }

    // Create accommodation
    @PostMapping
    public ResponseEntity<Accommodation> createAccommodation(@RequestBody Accommodation accommodation) {
        Accommodation newAccommodation = accommodationService.save(accommodation);
        return ResponseEntity.ok(newAccommodation);
    }

    // Update accommodation
    @PutMapping("/{id}")
    public ResponseEntity<Accommodation> updateAccommodation(@PathVariable Long id, @RequestBody Accommodation accommodation) {
        Accommodation updatedAccommodation = accommodationService.update(accommodation, id);
        return ResponseEntity.ok(updatedAccommodation);
    }

    // Delete accommodation
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccommodation(@PathVariable Long id) {
        accommodationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
