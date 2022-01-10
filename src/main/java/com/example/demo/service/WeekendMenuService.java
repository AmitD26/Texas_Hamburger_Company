package com.example.demo.service;

import com.example.demo.model.WeekendMenuItem;

import java.util.List;
import java.util.Optional;

public interface WeekendMenuService {

    public List<WeekendMenuItem> getAll();

    public WeekendMenuItem addItem(WeekendMenuItem weekendMenuItem);

    public Optional<WeekendMenuItem> findByItemName(String itemName);
}
