package com.vinyle.collection.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VinyleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vinyle_id")
    private int vinyle_id;

    @Column(name = "name")
    private String name;

    @Column(name = "tour_number")
    private int tour_number;

    @Column(name = "jacket")
    private String jacket;
}
