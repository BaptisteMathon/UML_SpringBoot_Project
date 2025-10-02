package com.nextu.fileshare.services;

import com.nextu.fileshare.entities.User;
import com.nextu.fileshare.exceptions.IllegalAccountException;

public class UserServiceImpl implements UserService {

    @Override
    public User create(final User user) {
        if(valid(user.getEmail()) && checkIfExistUser(user.getEmail())){
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
}
