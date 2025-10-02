package com.nextu.fileshare.mappers;

import com.nextu.fileshare.dto.UserCreateDTO;
import com.nextu.fileshare.dto.UserResponseDTO;
import com.nextu.fileshare.dto.UserResponseGetDTO;
import com.nextu.fileshare.entities.User;

import java.util.List;

public class UserMapper {
    public static User toEntity(UserCreateDTO dto) {
        User user = new User();
        user.setPrenom(dto.getPrenom());
        user.setNom(dto.getNom());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setAdmin(dto.isAdmin());
        return user;
    }

    public static UserResponseDTO toDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setPrenom(user.getPrenom());
        dto.setNom(user.getNom());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        return dto;
    }

    public static UserResponseGetDTO toDTO2(User user) {
        UserResponseGetDTO dto = new UserResponseGetDTO();
        dto.setPrenom(user.getPrenom());
        dto.setNom(user.getNom());
        dto.setEmail(user.getEmail());
        return dto;
    }

    public static List<UserResponseGetDTO> toDTOList(List<User> users) {
        return users.stream()
                .map(UserMapper::toDTO2)
                .toList();
    }

}
