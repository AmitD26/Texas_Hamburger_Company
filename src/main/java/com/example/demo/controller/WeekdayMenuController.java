package com.example.demo.controller;

import com.example.demo.model.WeekdayMenuItem;
import com.example.demo.service.WeekdayMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weekdayMenu")
public class WeekdayMenuController {
    private WeekdayMenuService weekdayMenuService;

    @Autowired
    public WeekdayMenuController(WeekdayMenuService weekdayMenuService) {
        this.weekdayMenuService = weekdayMenuService;
    }

    @GetMapping("/")
    public List<WeekdayMenuItem> getAllWeekdayMenuItems() {
        return weekdayMenuService.getAll();
    }

    @PostMapping("/addMenuItem")
    public WeekdayMenuItem addWeekdayMenuItem(@RequestBody WeekdayMenuItem weekdayMenuItem) {
        return weekdayMenuService.addItem(weekdayMenuItem);
    }
}
