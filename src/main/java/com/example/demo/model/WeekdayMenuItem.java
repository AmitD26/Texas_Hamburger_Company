package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Weekday_Menu")
@Data
public class WeekdayMenuItem {

    @Id
    private String itemName;

    private Double itemPrice;
}
