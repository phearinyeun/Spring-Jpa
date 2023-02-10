package dev.danvega.springBootJpa.service;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.response.Response;
import org.springframework.data.domain.Page;

public interface UserService {
    Response createUser (User user);
    Response findById(Long id);
    Response deleteById(Long id);
    Response update (User user, Long id);
    Response findByActive(Boolean active);
    Page<User> findAll(String name, org.springframework.data.domain.Pageable pageable, Integer age, Integer agemin, Integer agemax);
}
