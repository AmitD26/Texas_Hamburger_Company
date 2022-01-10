package com.example.demo.service;

import com.example.demo.model.WeekdayMenuItem;

import java.util.List;
import java.util.Optional;

public interface WeekdayMenuService {

    public List<WeekdayMenuItem> getAll();

    public WeekdayMenuItem addItem(WeekdayMenuItem weekdayMenuItem);

    public Optional<WeekdayMenuItem> findByItemName(String itemName);
}
