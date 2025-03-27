package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Reservations> findAll();

    Reservations findById(Long id);

    Reservations save(Reservations user);

    Reservations update(Reservations user, Long id);

    void deleteById(Long id);
}
