package com.example.auth;  // Ensure the correct package

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users") // Ensures mapping with 'users' table in DB
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false, unique = true) 
    private String username;

    @Column(nullable = false) 
    private String password;

    @Column(nullable = false)
    private String role;  // Example: "USER", "ADMIN"

    // Constructor
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
