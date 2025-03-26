package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Itineraries> findAll();

    Itineraries findById(Long id);

    Itineraries save(Itineraries user);

    Itineraries update(Itineraries user, Long id);

    void deleteById(Long id);
}
