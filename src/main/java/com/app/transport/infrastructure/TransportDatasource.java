package com.app.transport.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.transport.domain.ITransportRepository;
import com.app.transport.domain.Transport;

@Component
public class TransportDatasource {

    private final ITransportRepository transportRepository;

    public TransportDatasource(ITransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    public List<Transport> findAll() {
        return transportRepository.findAll();
    }
    public Optional<Transport> findById(Long id) {
        return transportRepository.findById(id);
    }

    public Transport save(Transport transport) {
        return transportRepository.save(transport);
    }

    public Optional<Transport> update(Transport transport, Long id) {
        return transportRepository.findById(id).map(existingTransport -> {
            existingTransport.setId(transport.getId());
            existingTransport.setDestination_id(transport.getDestination_id());
            existingTransport.setType(transport.getType());
            existingTransport.setPrice(transport.getPrice());
            existingTransport.setDuration(transport.getDuration());
            return transportRepository.save(existingTransport);
        });
    }

    public boolean deleteById(Long id) {
        if (transportRepository.existsById(id)) {
            transportRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
