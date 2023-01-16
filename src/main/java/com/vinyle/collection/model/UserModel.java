package com.vinyle.collection.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", columnDefinition = "INT")
    private int user_id;

    @Column(name = "user_name", columnDefinition = "VARCHAR(255)")
    private String user_name;

    @Column(name = "user_password", columnDefinition = "VARCHAR(255)")
    private String user_password;
}
