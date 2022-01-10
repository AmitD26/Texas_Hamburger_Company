package com.example.demo.model;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Time;

@Entity
@Data
public class Reservation {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @Cascade(CascadeType.ALL)
    private Location location;
//    private Time time;


}
