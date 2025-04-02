package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Service> findAll();

    Service findById(Long id);

    Service save(Service user);

    Service update(Service user, Long id);

    void deleteById(Long id);
}
