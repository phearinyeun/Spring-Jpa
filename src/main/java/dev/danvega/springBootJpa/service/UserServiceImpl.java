package dev.danvega.springBootJpa.service;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.repository.UserRepository;
import dev.danvega.springBootJpa.response.NotFoundException;
import dev.danvega.springBootJpa.response.Response;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Response getAllUser(Pageable pageable) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser(User user) {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        List<User> getAllUser = userRepository.findAll();
        if (!getAllUser.isEmpty()){
            return userRepository.findById(id);
        }
        throw new NotFoundException(id, "Not found Id", id.toString());
    }

    @Override
    public Optional<User> deleteById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()){
            userRepository.deleteById(id);
        }
        throw new NotFoundException(id, "Could not Found Id", id.toString());
    }
}
