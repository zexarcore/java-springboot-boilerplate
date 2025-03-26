package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Destinations> findAll();

    Destinations findById(Long id);

    Destinations save(Destinations user);

    Destinations update(Destinations user, Long id);

    void deleteById(Long id);
}
