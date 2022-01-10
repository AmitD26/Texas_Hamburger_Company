package com.example.demo.repository;

import com.example.demo.model.WeekdayMenuItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekdayMenuRepository extends CrudRepository<WeekdayMenuItem, String> {
}
