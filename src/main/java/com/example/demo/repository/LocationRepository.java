package com.example.demo.repository;

import com.example.demo.model.Location;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends PagingAndSortingRepository<Location, Integer> {

    List<Location> findByCity(String city);

    List<Location> findByState(String state);

    List<Location> findByZip(String zip);

//    @Query("select l from Location l limit :limit offset :offset")
//    List<Location> getPaginated(Integer limit, Integer offset);
}
