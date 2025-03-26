package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<TypeVehicles> findAll();

    TypeVehicles findById(Long id);

    TypeVehicles save(TypeVehicles user);

    TypeVehicles update(TypeVehicles user, Long id);

    void deleteById(Long id);
}
