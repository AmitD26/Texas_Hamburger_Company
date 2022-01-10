package com.example.demo.repository;

import com.example.demo.model.Location;
import com.example.demo.model.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    public List<Reservation> findByLocation(Location location);

}
