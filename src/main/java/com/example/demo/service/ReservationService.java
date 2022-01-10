package com.example.demo.service;

import com.example.demo.model.Location;
import com.example.demo.model.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {

    public List<Reservation> getAll();

    public Optional<Reservation> getReservationById(Integer id);

    public List<Reservation> getReservationsByLocation(Location location);

    public Reservation addReservation(Reservation reservation);
}
