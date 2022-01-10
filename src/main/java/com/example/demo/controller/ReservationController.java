package com.example.demo.controller;

import com.example.demo.model.Reservation;
import com.example.demo.service.LocationService;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private ReservationService reservationService;
    private LocationService locationService;

    @Autowired
    public ReservationController(ReservationService reservationService, LocationService locationService) {
        this.reservationService = reservationService;
        this.locationService = locationService;
    }

    @GetMapping("/")
    public List<Reservation> getAllReservations() {
        return reservationService.getAll();
    }

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation newReservation, @RequestParam("location_id") Integer location_id) {
        if (locationService.getLocationById(location_id).isPresent()) {
            newReservation.setLocation(locationService.getLocationById(location_id).get());
            return reservationService.addReservation(newReservation);
        } else {
            return null;
        }
    }

    @GetMapping("/byId/{id}")
    public Optional<Reservation> getReservationById(@PathVariable Integer id) {
        return reservationService.getReservationById(id);
    }

    @GetMapping("/byLocation/{loc_id}")
    public List<Reservation> getReservationsByLocation(@PathVariable Integer loc_id) {
        if (locationService.getLocationById(loc_id).isPresent()) {
            return reservationService.getReservationsByLocation(locationService.getLocationById(loc_id).get());
        }
        return null;
    }

}
