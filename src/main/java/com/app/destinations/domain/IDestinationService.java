package com.app.destinations.domain;

import java.util.List;

public interface IDestinationService {
    
    List<Destination> findAll();

    Destination findById(Long id);

    Destination save(Destination destination);

    Destination update(Destination destination, Long id);

    void deleteById(Long id);
}
