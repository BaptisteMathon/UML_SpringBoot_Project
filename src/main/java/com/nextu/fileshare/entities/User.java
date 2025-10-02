package com.nextu.fileshare.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String prenom;

    private String nom;

    private String email;

    private String password;

    private boolean isAdmin;
}
