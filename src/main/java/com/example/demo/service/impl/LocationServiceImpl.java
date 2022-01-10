package com.example.demo.service.impl;

import com.example.demo.model.Location;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getAll() {
        return (List<Location>) locationRepository.findAll();
    }

    @Override
    public Location addLocation(Location newLocation) {
        return locationRepository.save(newLocation);
    }

    @Override
    public Optional<Location> getLocationById(Integer id) {
        return locationRepository.findById(id);
    }

    @Override
    public List<Location> getLocationsByCity(String city) {
        return locationRepository.findByCity(city);
    }

    @Override
    public List<Location> getLocationsByState(String state) {
        return locationRepository.findByState(state);
    }

    @Override
    public List<Location> getLocationsByZip(String zip) {
        return locationRepository.findByZip(zip);
    }

    @Override
    public Optional<Location> deleteLocationById(Integer id) {
        Optional<Location> temp = locationRepository.findById(id);
        if (temp.isPresent()) {
            locationRepository.delete(temp.get());
            return temp;
        } else {
            return null;
        }
    }

    public List<Location> getPaginated(Integer pageSize, Integer pageStart) {
        return locationRepository.findAll(PageRequest.of(pageStart, pageSize)).toList();
    }

}
