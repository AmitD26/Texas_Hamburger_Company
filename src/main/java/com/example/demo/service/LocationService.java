package com.example.demo.service;

import com.example.demo.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    public List<Location> getAll();

    public Location addLocation(Location newLocation);

    public Optional<Location> getLocationById(Integer id);

    public List<Location> getLocationsByCity(String city);

    public List<Location> getLocationsByState(String state);

    public List<Location> getLocationsByZip(String zip);

    public Optional<Location> deleteLocationById(Integer id);

    public List<Location> getPaginated(Integer pageSize, Integer pageStart);

}
