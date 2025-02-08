package com.praveen.trello.user;

import org.springframework.web.bind.annotation.RestController;

import com.praveen.trello.user.dto.RegisterUserDto;
import com.praveen.trello.user.interfaces.UserView;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody RegisterUserDto dto) {
        User registeredUser = userService.registerUser(dto);
        return ResponseEntity.ok(registeredUser);
    }

    @GetMapping("/full-name/{name}")
    public UserView findOneUserByUsername(@PathVariable String name) {
        return this.userService.findOneUserByUsername(name);
    }

    @GetMapping("/starts-with/{name}")
    public List<UserView> findUserByNameStartsWith(@PathVariable String name) {
        return this.userService.findUserByNameStartsWith(name);
    }

}