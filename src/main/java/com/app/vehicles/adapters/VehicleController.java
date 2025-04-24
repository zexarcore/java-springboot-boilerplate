package com.app.vehicles.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.vehicles.domain.IVehicleService;
import com.app.vehicles.domain.Vehicle;

@RestController
@RequestMapping("/api/users")
public class VehicleController {

    private final IVehicleService vehicleService;

    public VehicleController(IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    // all users
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        List<Vehicle> vehicles = vehicleService.findAll();
        return ResponseEntity.ok(vehicles);
    }

    // user by id
    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable Long id) {
        Vehicle vehicle = vehicleService.findById(id);
        return ResponseEntity.ok(vehicle);
    }

    // create user
    @PostMapping
    public ResponseEntity<Vehicle> createvehicle(@RequestBody Vehicle vehicle) {
        Vehicle newVehicle = vehicleService.save(vehicle);
        return ResponseEntity.ok(newVehicle);
    }

    // update user
    @PutMapping("/{id}")
    public ResponseEntity<Vehicle> updateVehicle(@PathVariable Long id, @RequestBody Vehicle vehicle) {
        Vehicle updatedVehicle = vehicleService.update(vehicle, id);
        return ResponseEntity.ok(updatedVehicle);
    }

    // delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
