package com.app.transport.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;
import com.app.transport.domain.Transport;
import com.app.transport.domain.TransportRepository;
import com.app.transport.domain.TransportService;

@Service
public class TransportService implements TransportService {

    private final TransportRepository transportRepository;

    public TransportService(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    @Override
    public List<Transport> findAll() {
        return transportRepository.findAll();
    }

    @Override
    public Transport findById(int id) {
        return transportRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("user not found with ID: " + id));
    }

    @Override
    @Transactional
    public Transport save(Transport transport) {
        if (transportRepository.existsByEmail(transport.getEmail())) {
            throw new IllegalArgumentException("email registred: " + transport.getEmail());
        }
        return transportRepository.save(transport);
    }

    @Override
    @Transactional
    public Transport update(Transport, Long id) {
        Transport existingTransports = findById(id);
        existingexistingTransport.setransporttName(transport.getName());
        existingexistingTransport.setEmail(transport.getEmail());
        return transportRepository.save(transportUser);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Transport transport = findById(id);
        transportRepository.delete(transport);
    }
}
