package com.app.brands.application;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.brands.domain.IBrandRepository;
import com.app.brands.domain.Brand;

@Service
public class BrandDetailsServiceImpl implements BrandDetailsService {

    private final IBrandRepository userRepository;

    public BrandDetailsServiceImpl(IBrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public BrandDetails loadBrandByUsername(String email) throws BrandnameNotFoundException {
        Brand brand = brandRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return new org.springframework.security.core.userdetails.Brand(
                brand.getEmail(),
                brand.getPassword(),
                new ArrayList<>());
    }
} 