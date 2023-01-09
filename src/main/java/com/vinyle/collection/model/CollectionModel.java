package com.vinyle.collection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "collection")
@Getter
@Setter
public class CollectionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "collection_id", columnDefinition = "INT")
    private int Id;

    @Column(name = "collection_start", columnDefinition = "DATETIME")
    private Date collection_Start;

    @Column(name = "collection_style", columnDefinition = "INT")
    private String collection_style;
}
