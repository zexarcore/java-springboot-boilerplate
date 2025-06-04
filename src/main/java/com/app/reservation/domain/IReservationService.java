package com.app.reservation.domain;

import java.util.List;

public interface IReservationService {
    
    List<Reservation> findAll();

    Reservation findById(Long id);

    Reservation save(Reservation user);

    Reservation update(Reservation user, Long id);

    void deleteById(Long id);
}
