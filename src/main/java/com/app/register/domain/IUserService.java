package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Register> findAll();

    Register findById(Long id);

    Register save(Register user);

    Register update(Register user, Long id);

    void deleteById(Long id);
}
