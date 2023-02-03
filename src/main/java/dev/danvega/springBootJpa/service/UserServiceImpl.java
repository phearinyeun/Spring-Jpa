package dev.danvega.springBootJpa.service;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser(User user) {
        return userRepository.findAll();
    }
}
