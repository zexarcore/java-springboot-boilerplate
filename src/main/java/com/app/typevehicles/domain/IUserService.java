package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Typevehicle> findAll();

    Typevehicle findById(Long id);

    Typevehicle save(Typevehicle user);

    Typevehicle update(Typevehicle user, Long id);

    void deleteById(Long id);
}
