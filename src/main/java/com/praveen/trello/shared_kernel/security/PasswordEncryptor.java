package com.praveen.trello.shared_kernel.security;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncryptor {
    public String encrypt(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(10));
    }
}
