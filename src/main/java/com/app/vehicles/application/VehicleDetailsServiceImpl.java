package com.app.vehicles.application;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.vehicles.domain.IVehicleRepository;
import com.app.vehicles.domain.Vehicle;

@Service
public class VehicleDetailsServiceImpl implements VehicleDetailsService {

    private final IVehicleRepository vehicleRepository;

    public VehicleDetailsServiceImpl(IVehicleRepository userRepository) {
        this.vehicleRepository = userRepository;
    }

    @Override
    public VehicleDetails loadVehicleByUsername(String email) throws VehiclenameNotFoundException {
        Vehicle vehicle = vehicleRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return new org.springframework.security.core.userdetails.Vehicle(
                vehicle.getEmail(),
                vehicle.getPassword(),
                new ArrayList<>());
    }
} 