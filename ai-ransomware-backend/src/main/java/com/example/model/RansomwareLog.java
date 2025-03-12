package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ransomware_logs")  // Table name in Supabase
public class RansomwareLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "log_data")  // Column in database
    private String logData;

    // Constructors
    public RansomwareLog() {}

    public RansomwareLog(String logData) {
        this.logData = logData;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogData() {
        return logData;
    }

    public void setLogData(String logData) {
        this.logData = logData;
    }
}
