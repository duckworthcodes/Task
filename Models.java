package com.taskquest.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String priority;
    private int points;
    private boolean completed;

    private LocalDateTime completedAt;

    // getters & setters
}
