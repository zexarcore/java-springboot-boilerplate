package com.app.itineraries.domain;

import java.util.List;

public interface IItinerarieService {
    
    List<Itinerarie> findAll();

    Itinerarie findById(Long id);

    Itinerarie save(Itinerarie user);

    Itinerarie update(Itinerarie user, Long id);

    void deleteById(Long id);
}
