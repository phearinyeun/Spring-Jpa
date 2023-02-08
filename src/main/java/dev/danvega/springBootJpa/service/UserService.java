package dev.danvega.springBootJpa.service;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.response.Response;

import java.awt.print.Pageable;
import java.util.List;

public interface UserService {
    Response getAllUser(Pageable pageable);
    Response createUser (User user);
    Response getAllUser(User user);
    Response findById(Long id);
    Response deleteById(Long id);
    Response update (User user, Long id);
    List<User> findByActiveTrue();
    List<User> findByActiveFalse();
}
