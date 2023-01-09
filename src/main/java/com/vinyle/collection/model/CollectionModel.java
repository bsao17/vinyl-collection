package com.vinyle.collection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class CollectionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "collection_id")
    private int Id;

    @Column(name = "collection_start")
    private LocalDate collection_Start;

    @Column(name = "collection_style")
    private String collection_style;
}
