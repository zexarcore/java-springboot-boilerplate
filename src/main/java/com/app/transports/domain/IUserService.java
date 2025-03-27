package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Transports> findAll();

    Transports findById(Long id);

    Transports save(Transports user);

    Transports update(Transports user, Long id);

    void deleteById(Long id);
}
