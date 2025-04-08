package com.app.transport.domain;

import java.util.List;

public interface TransportService {
    
    List<Transport> findAll();

    Transport findById(int id);

    Transport save(Transport transpor);

    Transport update(Transport transpor, int id);

    void deleteById(long id);
}
