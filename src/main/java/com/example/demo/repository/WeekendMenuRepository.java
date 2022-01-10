package com.example.demo.repository;

import com.example.demo.model.WeekendMenuItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekendMenuRepository extends CrudRepository<WeekendMenuItem, String> {
}
