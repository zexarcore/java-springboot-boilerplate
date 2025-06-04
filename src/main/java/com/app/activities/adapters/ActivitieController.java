package com.app.activities.adapters;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.activities.domain.IActivitieService;
import com.app.activities.domain.Activitie;

@RestController
@RequestMapping("/api/activities")
public class ActivitieController {

    private final IActivitieService activitieService;

    public ActivitieController(IActivitieService activitieService) {
        this.activitieService = activitieService;
    }

    @GetMapping
    public ResponseEntity<List<Activitie>> getAllActivities() {
        List<Activitie> activities = activitieService.findAll();
        return ResponseEntity.ok(activities);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Activitie> getActivityById(@PathVariable Long id) {
        Activitie activitie = activitieService.findById(id);
        return ResponseEntity.ok(activitie);
    }

    @PostMapping
    public ResponseEntity<Activitie> createActivity(@RequestBody Activitie activitie) {
        Activitie newActivitie = activitieService.save(activitie);
        return ResponseEntity.ok(newActivitie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Activitie> updateActivity(@PathVariable Long id, @RequestBody Activitie activitie) {
        Activitie updatedActivitie = activitieService.update(activitie, id);
        return ResponseEntity.ok(updatedActivitie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteActivity(@PathVariable Long id) {
        activitieService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

