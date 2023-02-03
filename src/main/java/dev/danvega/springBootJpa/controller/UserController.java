package dev.danvega.springBootJpa.controller;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public User crateUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUser(User user){
        return userService.getAllUser(user);
    }
}
