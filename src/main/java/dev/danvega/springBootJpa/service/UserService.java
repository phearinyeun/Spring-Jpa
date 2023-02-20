package dev.danvega.springBootJpa.service;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.response.Response;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<User> read(User user);
    Response createUser (User user);
    Response findById(Long id);
    Response deleteById(Long id);
    Response update (User user, Long id);
    Response findByActive(Boolean active);
    Page<User> findAll(String name, Pageable pageable, Integer age, Integer ageMin, Integer ageMax);
}
