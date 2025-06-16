package com.app.reservation.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.reservation.domain.IReservationRepository;
import com.app.reservation.domain.Reservation;

@Component
public class ReservationDatasource {

    private final IReservationRepository reservationRepository;

    public ReservationDatasource(IReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }
    public Optional<Reservation> findById(Long id) {
        return reservationRepository.findById(id);
    }

    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Optional<Reservation> update(Reservation reservation, Long id) {
        return reservationRepository.findById(id).map(existingUser -> {
            existingUser.setId(reservation.getId());
            existingUser.setUsers_Id(reservation.getUsers_Id());
            existingUser.setDestination_Id(reservation.getDestination_Id());
            existingUser.setActivity_id(reservation.getActivity_id());
            existingUser.setReservations_date(reservation.getReservations_date());
            existingUser.setQuantity(reservation.getQuantity());
            return reservationRepository.save(existingUser);
        });
    }

    public boolean deleteById(Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
