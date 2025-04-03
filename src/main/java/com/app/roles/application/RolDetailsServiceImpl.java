package com.app.roles.application;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.roles.domain.IRolRepository;
import com.app.roles.domain.Rol;

@Service
public class RolDetailsServiceImpl implements RolDetailsService {

    private final IRolRepository rolRepository;

    public RolDetailsServiceImpl(IRolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public RolDetails loadRolByUsername(String email) throws RolnameNotFoundException {
        Rol rol = rolRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return new org.springframework.security.core.userdetails.User(
                rol.getEmail(),
                rol.getPassword(),
                new ArrayList<>());
    }
} 