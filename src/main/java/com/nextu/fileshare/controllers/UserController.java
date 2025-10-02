package com.nextu.fileshare.controllers;

import com.nextu.fileshare.dto.UserCreateDTO;
import com.nextu.fileshare.dto.UserResponseDTO;
import com.nextu.fileshare.dto.UserResponseGetDTO;
import com.nextu.fileshare.entities.User;
import com.nextu.fileshare.mappers.UserMapper;
import com.nextu.fileshare.services.UserService;
import com.nextu.fileshare.services.UserServiceImpl;
import com.nextu.fileshare.utils.EmailSender;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/user", produces = {MediaType.APPLICATION_JSON_VALUE,  MediaType.APPLICATION_XML_VALUE})
    public List<UserResponseGetDTO> getUser() {

        List<User> allUsers = userService.getAllUsers();
        return UserMapper.toDTOList(allUsers);

    }

    @PostMapping(value = "/users",consumes =  MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponseDTO users(@RequestBody UserCreateDTO dto) {
        User user = UserMapper.toEntity(dto);
        User savedUser = userService.create(user);
        return UserMapper.toDTO(savedUser);
    }

//    @PostMapping("/users")
//    public String users() {
//        UserService userService = new UserServiceImpl();
//
//        User u1 = new User();
//        u1.setPrenom("John");
//        u1.setNom("John");
//        u1.setEmail("johngmail.com");
//        u1.setPassword("john");
//        u1.setAdmin(true);
//        u1.setId(1);
//
//        userService.create(u1);
//
//        return "users";
//    }
}
