package com.vinyle.collection.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vinyl")
@Getter
@Setter
public class VinylModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vinyl_id", columnDefinition = "INT")
    private int vinyl_id;

    @Column(name = "artist_name", columnDefinition = "VARCHAR(255)")
    private String artistName;

    @Column(name = "vinyl_title", columnDefinition = "VARCHAR(255)")
    private String vinylTitle;

    @Column(name = "vinyl_size", columnDefinition = "INT")
    private int vinylSize;

    @Column(name = "vinyl_color", columnDefinition = "VARCHAR(255)")
    private String vinylColor;

    @Column(name = "vinyl_jacket", columnDefinition = "VARCHAR(255)")
    private String vinylJacket;

}
