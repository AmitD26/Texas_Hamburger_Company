package com.example.demo.controller;

import com.example.demo.model.WeekdayMenuItem;
import com.example.demo.model.WeekendMenuItem;
import com.example.demo.service.WeekendMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weekendMenu")
public class WeekendMenuController {

    private WeekendMenuService weekendMenuService;

    @Autowired
    public WeekendMenuController(WeekendMenuService weekendMenuService) {
        this.weekendMenuService = weekendMenuService;
    }

    @GetMapping("/")
    public List<WeekendMenuItem> getAllWeekendMenuItems() {
        return weekendMenuService.getAll();
    }

    @PostMapping("/addMenuItem")
    public WeekendMenuItem addWeekendMenuItem(@RequestBody WeekendMenuItem weekendMenuItem) {
        return weekendMenuService.addItem(weekendMenuItem);
    }
}
