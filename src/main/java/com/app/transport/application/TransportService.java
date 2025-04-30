package com.app.transport.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;

import com.app.transport.domain.ITransportRepository;
import com.app.transport.domain.ITransportService;
import com.app.transport.domain.Transport;

@Service
public class TransportService implements ITransportService {

    private final ITransportRepository transportRepository;

    public TransportService(ITransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    @Override
    public List<Transport> findAll() {
        return transportRepository.findAll();
    }

    @Override
    public Transport findById(Long id) {
        return transportRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Transport not found with ID: " + id));
    }

    @Override
    @Transactional
    public Transport save(Transport transport) {
        boolean alreadyExists = transportRepository.existsByDurationAndPrice(
            transport.getDuration(),
            transport.getPrice()
        );
    
        if (alreadyExists) {
            throw new IllegalArgumentException("A transport with this duration and price already exists.");
        }
    
        return transportRepository.save(transport);
    }
    
    @Override
    @Transactional
    public Transport update(Transport updatedTransport, Long id) {
        Transport existingTransport = findById(id);
        existingTransport.setDuration(updatedTransport.getDuration());
        existingTransport.setPrice(updatedTransport.getPrice());
        // Any other fields to update based on your entity
        return transportRepository.save(existingTransport);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Transport transport = findById(id);
        transportRepository.delete(transport);
    }
}