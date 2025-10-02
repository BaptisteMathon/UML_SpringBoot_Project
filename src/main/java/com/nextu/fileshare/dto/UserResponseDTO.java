package com.nextu.fileshare.dto;

import lombok.Data;

@Data
public class UserResponseDTO {
    private String nom;
    private String prenom;
    private String email;
    private String password;
}
