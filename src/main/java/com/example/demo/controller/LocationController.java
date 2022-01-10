package com.example.demo.controller;

import com.example.demo.model.Location;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/all")
    public List<Location> getAllLocations(@RequestParam("limit") Optional<Integer> limit, @RequestParam("offset") Optional<Integer> offset) {
        int pageSize = limit.isPresent() ? limit.get() : 25;
        int page = offset.isPresent() ? offset.get() : 0;
        page = page / pageSize;

        return locationService.getPaginated(pageSize, page);
    }

    @PostMapping("/addLocation")
    public Location addLocation(@RequestBody Location newLocation) {
        return locationService.addLocation(newLocation);
    }

    @GetMapping("/byId/{id}")
    public Optional<Location> getLocationById(@PathVariable Integer id) {
        return locationService.getLocationById(id);
    }

    @GetMapping("/byCity/{city}")
    public List<Location> getLocationByCity(@PathVariable String city) {
        return locationService.getLocationsByCity(city);
    }

    @GetMapping("/byState/{state}")
    public List<Location> getLocationByState(@PathVariable String state) {
        return locationService.getLocationsByState(state);
    }

    @GetMapping("/byZip/{zip}")
    public List<Location> getLocationByZip(@PathVariable String zip) {
        return locationService.getLocationsByZip(zip);
    }

    @PutMapping("/{id}")
    public Location updateLocationById(@RequestBody Location location, @PathVariable Integer id) {
        location.setId(id);
        locationService.addLocation(location);
        return location;
    }

    @DeleteMapping("/{id}")
    public Optional<Location> deleteLocationById(@PathVariable Integer id) {
        return locationService.deleteLocationById(id);
    }
}
