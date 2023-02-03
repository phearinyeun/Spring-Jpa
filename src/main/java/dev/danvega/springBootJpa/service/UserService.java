package dev.danvega.springBootJpa.service;

import dev.danvega.springBootJpa.model.User;

import java.util.List;

public interface UserService {
    User createUser (User user);
    List<User> getAllUser(User user);
}
