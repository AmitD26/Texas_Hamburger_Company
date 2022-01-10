package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue
    private Integer id;

    private String city;
    private String state;
    private String zip;
    private Integer startHour;
    private Integer endHour;
}
