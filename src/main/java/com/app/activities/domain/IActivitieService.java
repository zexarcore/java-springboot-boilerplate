package com.app.activities.domain;

import java.util.List;

public interface IActivitieService {
    
    List<Activitie> findAll();

    Activitie findById(Long id);

    Activitie save(Activitie activitie);

    Activitie update(Activitie activitie, Long id);

    void deleteById(Long id);
}
