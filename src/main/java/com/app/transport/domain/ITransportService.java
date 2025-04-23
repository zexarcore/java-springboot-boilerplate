package com.app.transport.domain;

import java.util.List;

public interface ITransportService {
    
    List<Transport> findAll();

    Transport findById(Long id);

    Transport save(Transport transpor);

    Transport update(Transport transpor, Long id);

    void deleteById(long id);

    Object findById(Class<Long> class1);
}
