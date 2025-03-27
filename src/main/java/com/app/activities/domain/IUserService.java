package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Activities> findAll();

    Activities findById(Long id);

    Activities save(Activities user);

    Activities update(Activities user, Long id);

    void deleteById(Long id);
}
