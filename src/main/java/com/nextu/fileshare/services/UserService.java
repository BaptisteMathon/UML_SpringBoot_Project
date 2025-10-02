package com.nextu.fileshare.services;

import com.nextu.fileshare.entities.User;
import com.nextu.fileshare.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User create(User user);

    List<User> getAllUsers();
}
