package com.nextu.fileshare.dto;

import lombok.Data;

@Data
public class UserCreateDTO {
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private boolean admin;
}
