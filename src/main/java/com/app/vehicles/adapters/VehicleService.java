package com.app.vehicles.adapters;

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
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found with ID: " + id));
    }

    @Override
    @Transactional
    public Vehicle save(Vehicle vehicle) {
        // Validar si la placa es válida
        if (vehicle.getPlate() == null || vehicle.getPlate().isEmpty()) {
            throw new IllegalArgumentException("Plate cannot be null or empty");
        }
        // Validar si la placa ya está registrada
        if (vehicleRepository.existsByPlate(vehicle.getPlate())) {
            throw new IllegalArgumentException("Plate already registered: " + vehicle.getPlate());
        }
        return vehicleRepository.save(vehicle);
    }

    @Override
    @Transactional
    public Vehicle update(Vehicle vehicle, Long id) {
        Vehicle existingVehicle = findById(id);

        // Validar los campos del vehículo proporcionado
        if (vehicle.getPlate() == null || vehicle.getPlate().isEmpty()) {
            throw new IllegalArgumentException("Plate cannot be null or empty");
        }
        if (vehicle.getTypeVehicle() == null) {
            throw new IllegalArgumentException("TypeVehicle cannot be null");
        }
        if (vehicle.getBrand() == null) {
            throw new IllegalArgumentException("Brand cannot be null");
        }
        if (vehicle.getColor() == null || vehicle.getColor().isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or empty");
        }

        existingVehicle.setPlate(vehicle.getPlate());
        existingVehicle.setTypeVehicle(vehicle.getTypeVehicle());
        existingVehicle.setBrand(vehicle.getBrand());
        existingVehicle.setColor(vehicle.getColor());
        return vehicleRepository.save(existingVehicle);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Vehicle vehicle = findById(id);
        vehicleRepository.delete(vehicle);
    }
}
