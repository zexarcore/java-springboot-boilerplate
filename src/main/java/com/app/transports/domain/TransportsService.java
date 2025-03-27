package com.app.transports.domain;

import java.util.List;

public interface TransportsService {
    
    List<Transports> findAll();

    Transports findById(Long id);

    Transports save(Transports transpor);

    Transports update(Transports transpor, Long id);

    void deleteById(Long id);
}
