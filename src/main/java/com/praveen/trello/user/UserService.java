package com.praveen.trello.user;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.praveen.trello.shared_kernel.security.PasswordEncryptor;
import com.praveen.trello.user.dto.RegisterUserDto;
import com.praveen.trello.user.interfaces.UserView;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncryptor passwordEncryptor;

    public UserService(UserRepository userRepository, PasswordEncryptor passwordEncryptor) {
        this.userRepository = userRepository;
        this.passwordEncryptor = passwordEncryptor;
    }

    @Transactional
    public User registerUser(RegisterUserDto dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(passwordEncryptor.encrypt(dto.getPassword()));

        return userRepository.save(user);
    }

    public UserView findOneUserByUsername(String name) {
        return this.userRepository.findByName(name);
    }

    public List<UserView> findUserByNameStartsWith(String name) {
        return this.userRepository.findByNameStartsWith(name);
    }
}