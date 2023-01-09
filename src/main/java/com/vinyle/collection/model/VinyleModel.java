package com.vinyle.collection.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vinyle")
@Getter
@Setter
public class VinyleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vinyle_id", columnDefinition = "INT")
    private int vinyle_id;

    @Column(name = "title", columnDefinition = "VARCHAR(255)")
    private String title;

    @Column(name = "tour_number", columnDefinition = "INT")
    private int tour_number;

    @Column(name = "jacket", columnDefinition = "VARCHAR(255)")
    private String jacket;

}
