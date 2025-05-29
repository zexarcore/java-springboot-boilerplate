package com.app.activities.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;

import com.app.activities.domain.IActivitieRepository;
import com.app.activities.domain.IActivitieService;
import com.app.activities.domain.Activitie;

@Service
public class ActivitieService implements IActivitieService {

    private final IActivitieRepository activitieRepository;

    public ActivitieService(IActivitieRepository activitieRepository) {
        this.activitieRepository = activitieRepository;
    }

    @Override
    public List<Activitie> findAll() {
        return activitieRepository.findAll();
    }

    @Override
    public Activitie findById(Long id) {
        return activitieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Activity not found with ID: " + id));
    }

    @Override
    @Transactional
    public Activitie save(Activitie activitie) {
        boolean yaExiste = activitieRepository.existsByNameAndPrice(
            activitie.getName(),
            activitie.getPrice()
        );
    
        if (yaExiste) {
            throw new IllegalArgumentException("Ya existe una actividad con ese nombre y precio.");
        }
    
        return activitieRepository.save(activitie);
    }
    

    @Override
    @Transactional
    public Activitie update(Activitie updatedActivitie, Long id) {
        Activitie existingActivitie = findById(id);
        existingActivitie.setName(updatedActivitie.getName());
        existingActivitie.setDescription(updatedActivitie.getDescription());
        existingActivitie.setSchedule(updatedActivitie.getSchedule());
        existingActivitie.setPrice(updatedActivitie.getPrice());
        // otros campos a actualizar según tu entidad
        return activitieRepository.save(existingActivitie);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Activitie activitie = findById(id);
        activitieRepository.delete(activitie);
    }
}