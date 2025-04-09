package com.app.services.application;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.services.domain.IServiceRepository;
import com.app.services.domain.CarService;

@Service
public class CarServiceDetailsServiceImpl implements UserDetailsService {

    private final IServiceRepository userRepository;

    public CarServiceDetailsServiceImpl(IServiceRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public CarService loadUserByUsername(String email) throws UsernameNotFoundException {
        CarService user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return new org.springframework.security.core.userdetails.CarService(
                user.getEmail(),
                user.getPassword(),
                new ArrayList<>());
    }
} 