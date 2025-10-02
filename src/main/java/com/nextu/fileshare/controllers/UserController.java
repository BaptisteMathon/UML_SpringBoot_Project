package com.nextu.fileshare.controllers;

import com.nextu.fileshare.entities.User;
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

    @GetMapping(path = "/user", produces = MediaType.APPLICATION_XML_VALUE)
    public List<User> getUser() {
        User u1 = new User();
        u1.setEmail("baptiste@gmail.com");
        u1.setPassword("1234");
        u1.setId(1);
        u1.setAdmin(true);
        u1.setPrenom("Baptiste");
        u1.setNom("MATHON");

        User u2 = new User();
        u2.setEmail("test@gmail.com");
        u2.setPassword("1234");
        u2.setId(2);
        u2.setAdmin(false);
        u2.setPrenom("test");
        u2.setNom("test");

        User u3 = new User();
        u3.setEmail("toto@gmail.com");
        u3.setPassword("1234");
        u3.setId(3);
        u3.setAdmin(false);
        u3.setPrenom("toto");
        u3.setNom("toto");

        return List.of(u1, u2, u3);
    }

    @PostMapping(value = "/users",consumes =  MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String users(@RequestBody User userInfo) {
        return "utilisateur créé, user : " + userInfo.getEmail();
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
