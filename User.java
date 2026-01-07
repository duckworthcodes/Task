package com.taskquest.model;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String pin;   // simplified authentication

    private int totalPoints;
    private int streak;

    // getters & setters
}
