package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Weekend_Menu")
@Data
public class WeekendMenuItem {

    @Id
    private String itemName;

    private Double itemPrice;
}
