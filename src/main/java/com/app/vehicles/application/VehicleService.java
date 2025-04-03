package com.app.vehicles.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;

import com.app.vehicles.domain.IVehicleRepository;
import com.app.vehicles.domain.IVehicleService;
import com.app.vehicles.domain.Vehicle;

@Service
public class VehicleService implements IVehicleService {

    private final IVehicleRepository vehicleRepository;

    public VehicleService(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle findById(Long id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("user not found with ID: " + id));
    }

    @Override
    @Transactional
    public Vehicle save(Vehicle vehicle) {
        if (vehicleRepository.existsByEmail(vehicle.getEmail())) {
            throw new IllegalArgumentException("email registred: " + vehicle.getEmail());
        }
        return vehicleRepository.save(vehicle);
    }

    @Override
    @Transactional
    public Vehicle update(Vehicle user, Long id) {
        Vehicle existingVehicle = findById(id);
        existingVehicle.setName(vehicle.getName());
        existingVehicle.setEmail(vehicle.getEmail());
        return vehicleRepository.save(existingVehicle);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Vehicle user = findById(id);
        vehicleRepository.delete(vehicle);
    }
}
