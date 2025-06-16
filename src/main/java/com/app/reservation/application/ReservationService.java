package com.app.reservation.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;
import com.app.reservation.domain.IReservationRepository;
import com.app.reservation.domain.IReservationService;
import com.app.reservation.domain.Reservation;

@Service
public class ReservationService implements IReservationService {

    private final IReservationRepository reservationRepository;

    public ReservationService(IReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found with ID: " + id));
    }

    @Override
    @Transactional
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    @Transactional
    public Reservation update(Reservation reservation, Long id) {
        Reservation existing = findById(id);
        existing.setUsers_Id(reservation.getUsers_Id());
        existing.setDestination_Id(reservation.getDestination_Id());
        existing.setActivity_id(reservation.getActivity_id());
        existing.setReservations_date(reservation.getReservations_date());  
        existing.setQuantity(reservation.getQuantity());
        return reservationRepository.save(existing);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Reservation reservation = findById(id);
        reservationRepository.delete(reservation);
    }
}


