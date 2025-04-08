package com.app.accommodations.domain;

import java.util.List;

public interface IAccommodationService {
    
    List<Accommodation> findAll();

    Accommodation findById(Long id);

    Accommodation save(Accommodation accommodation);

    Accommodation update(Accommodation accommodation, Long id);

    void deleteById(Long id);
}
