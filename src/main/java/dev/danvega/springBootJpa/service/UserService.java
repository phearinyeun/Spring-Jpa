package dev.danvega.springBootJpa.service;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.response.Response;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface UserService {
    Response getAllUser(Pageable pageable);
    User createUser (User user);
    List<User> getAllUser(User user);
    Optional<User> findById(Long id);
    Optional<User> deleteById(Long id);
}
