package com.app.vehicles.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.vehicles.domain.IVehicleRepository;
import com.app.vehicles.domain.Vehicle;

@Component
public class VehicleDatasource {

    private final IVehicleRepository vehicleRepository;

    public VehicleDatasource(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    // Obtener todos los vehículos
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    // Buscar vehículo por ID
    public Optional<Vehicle> findById(Long id) {
        return vehicleRepository.findById(id);
    }

    // Guardar un nuevo vehículo
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    // Actualizar un vehículo existente
    public Optional<Vehicle> update(Vehicle vehicle, Long id) {
        return vehicleRepository.findById(id).map(existingVehicle -> {
            existingVehicle.setPlate(vehicle.getPlate());
            existingVehicle.setTypeVehicle(vehicle.getTypeVehicle());
            existingVehicle.setBrand(vehicle.getBrand());
            existingVehicle.setColor(vehicle.getColor());
            return vehicleRepository.save(existingVehicle);
        });
    }

    // Eliminar un vehículo por ID
    public boolean deleteById(Long id) {
        if (vehicleRepository.existsById(id)) {
            vehicleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}