package com.app.activities.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.activities.domain.IActivitieRepository;
import com.app.activities.domain.Activitie;

@Component
public class ActivitiesDatasource {

    private final IActivitieRepository activitiesRepository;

    public ActivitiesDatasource(IActivitieRepository activitiesRepository) {
        this.activitiesRepository = activitiesRepository;
    }

    public List<Activitie> findAll() {
        return activitiesRepository.findAll();
    }
    public Optional<Activitie> findById(Long id) {
        return activitiesRepository.findById(id);
    }

    public Activitie save(Activitie activities) {
        return activitiesRepository.save(activities);
    }

    public Optional<Activitie> update(Activitie activities, Long id) {
        return activitiesRepository.findById(id).map(existingactivities -> {
            existingactivities.setDestination_id(activities.getDestination_id());
            existingactivities.setName(activities.getName());
            existingactivities.setDescription(activities.getDescription());
            existingactivities.setSchedule(activities.getSchedule());
            existingactivities.setPrice(activities.getPrice());
            return activitiesRepository.save(existingactivities);
        });
    }

    public boolean deleteById(Long id) {
        if (activitiesRepository.existsById(id)) {
            activitiesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
