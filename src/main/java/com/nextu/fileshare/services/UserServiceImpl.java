package com.nextu.fileshare.services;

import com.nextu.fileshare.entities.User;
import com.nextu.fileshare.exceptions.IllegalAccountException;
import com.nextu.fileshare.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(final User user) {
        if(valid(user.getEmail()) && checkIfExistUser(user.getEmail())){

            userRepository.save(user);
            System.out.println("Utilisateur créé");
            return user;
        } else {
            throw new IllegalAccountException("Email invalide : ", user.getEmail());
        }
    }

    private boolean valid(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    private boolean checkIfExistUser(String email) {
        return true;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
