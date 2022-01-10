package com.example.demo.service.impl;

import com.example.demo.model.WeekendMenuItem;
import com.example.demo.repository.WeekendMenuRepository;
import com.example.demo.service.WeekendMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeekendMenuServiceImpl implements WeekendMenuService {

    private WeekendMenuRepository weekendMenuRepository;

    @Autowired
    public WeekendMenuServiceImpl(WeekendMenuRepository weekendMenuRepository) {
        this.weekendMenuRepository = weekendMenuRepository;
    }

    @Override
    public List<WeekendMenuItem> getAll() {
        return (List<WeekendMenuItem>) weekendMenuRepository.findAll();
    }

    @Override
    public WeekendMenuItem addItem(WeekendMenuItem weekendMenuItem) {
        return weekendMenuRepository.save(weekendMenuItem);
    }

    @Override
    public Optional<WeekendMenuItem> findByItemName(String itemName) {
        return weekendMenuRepository.findById(itemName);
    }
}
