package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Services> findAll();

    Services findById(Long id);

    Services save(Services user);

    Services update(Services user, Long id);

    void deleteById(Long id);
}
