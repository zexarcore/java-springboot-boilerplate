package com.app.reservation.adapters;  

import java.util.List;  

import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  

import com.app.reservation.domain.IReservationService;  
import com.app.reservation.domain.Reservation;  

@RestController  
@RequestMapping("/api/reservations")  
public class ReservationController {  

    private final IReservationService reservationService;  

    public ReservationController(IReservationService reservationService) {  
        this.reservationService = reservationService;  
    }  

    // Obtener todas las reservas  
    @GetMapping  
    public ResponseEntity<List<Reservation>> getAllReservations() {  
        List<Reservation> reservations = reservationService.findAll();  
        return ResponseEntity.ok(reservations);  
    }  

    // Obtener reserva por ID  
    @GetMapping("/{id}")  
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long id) {  
        Reservation reservation = reservationService.findById(id);  
        return ResponseEntity.ok(reservation);  
    }  

    // Crear nueva reserva  
    @PostMapping  
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {  
        Reservation newReservation = reservationService.save(reservation);  
        return ResponseEntity.ok(newReservation);  
    }  

    // Actualizar reserva existente  
    @PutMapping("/{id}")  
    public ResponseEntity<Reservation> updateReservation(@PathVariable Long id, @RequestBody Reservation reservation) {  
        Reservation updatedReservation = reservationService.update(reservation, id);  
        return ResponseEntity.ok(updatedReservation);  
    }  

    // Eliminar reserva por ID  
    @DeleteMapping("/{id}")  
    public ResponseEntity<Void> deleteReservation(@PathVariable Long id) {  
        reservationService.deleteById(id);  
        return ResponseEntity.noContent().build();  
    }  
}  