package dev.danvega.springBootJpa.service;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.repository.CustomerSpecifications;
import dev.danvega.springBootJpa.repository.UserRepository;
import dev.danvega.springBootJpa.response.NotFoundException;
import dev.danvega.springBootJpa.response.Response;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.data.jpa.domain.Specification.where;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Response createUser(User user) {
        return new Response(200, "Success", userRepository.save(user));
    }

    @Override
    public Response findById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()){
            return new Response(200, "Success",userRepository.findById(id));
        }
        throw new NotFoundException(id, "Not Found id ", id.toString());
    }

    @Override
    public Response deleteById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()){
            userRepository.deleteById(id);
            return null;
        }
        throw new NotFoundException(id, "Could not Found Id", id.toString());
    }

    @Override
    public Response update(User user, Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()){
            user.setId(id);
            userRepository.save(user);
            return new Response(200, "Success updated user", user);
        }
        throw new NotFoundException(id, "Not Found the Id", id.toString());
    }

    @Override
    public Response findByActive(Boolean active) {
        return new Response(200, "Success", userRepository.findByActive(active));
    }

    @Override
    public Page<User> findAll(String name, Pageable pageable, Integer age, Integer ageMax, Integer ageMin) {
        return userRepository.findAll(
                where(CustomerSpecifications.searchByName(name))
                        .and(
                                where(CustomerSpecifications.getAge(age)
                                .or(CustomerSpecifications.getAgeBetween(ageMax, ageMin))
                        )
                )
                ,pageable);
    }
}
