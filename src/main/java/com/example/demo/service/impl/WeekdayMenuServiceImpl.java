package com.example.demo.service.impl;

import com.example.demo.model.WeekdayMenuItem;
import com.example.demo.repository.WeekdayMenuRepository;
import com.example.demo.service.WeekdayMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeekdayMenuServiceImpl implements WeekdayMenuService {

    private WeekdayMenuRepository weekdayMenuRepository;

    @Autowired
    public WeekdayMenuServiceImpl(WeekdayMenuRepository weekdayMenuRepository) {
        this.weekdayMenuRepository = weekdayMenuRepository;
    }

    @Override
    public List<WeekdayMenuItem> getAll() {
        return (List<WeekdayMenuItem>) weekdayMenuRepository.findAll();
    }

    @Override
    public WeekdayMenuItem addItem(WeekdayMenuItem weekdayMenuItem) {
        return weekdayMenuRepository.save(weekdayMenuItem);
    }

    @Override
    public Optional<WeekdayMenuItem> findByItemName(String itemName) {
        return weekdayMenuRepository.findById(itemName);
    }
}
