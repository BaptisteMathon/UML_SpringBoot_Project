package com.nextu.fileshare.exceptions;

public class IllegalAccountException extends RuntimeException {
    public IllegalAccountException(String message, String email) {
        super(message + email);
    }
}
