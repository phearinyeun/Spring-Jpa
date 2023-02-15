package dev.danvega.springBootJpa.controller;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.repository.UserPaginationAndFilter;
import dev.danvega.springBootJpa.repository.UserRepository;
import dev.danvega.springBootJpa.response.Response;
import dev.danvega.springBootJpa.service.UserServiceImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService,
                          UserRepository userRepository) {
        this.userService = userService;
    }

    @PostMapping
    public Response crateUser(@RequestBody User user){
        userService.createUser(user);
        return null;
    }

    @GetMapping
    public Response findAll(UserPaginationAndFilter userPaginationAndFilter){
        return new Response(200, "Success" ,userService.findAll(userPaginationAndFilter.getName(),
                PageRequest.of(userPaginationAndFilter.getPage(), userPaginationAndFilter.getSize(),
                        Sort.by("age")
                                .and(Sort.by("name").ascending()).descending()),
                userPaginationAndFilter.getAge(),
                userPaginationAndFilter.getAgemax(),
                userPaginationAndFilter.getAgemin()));
    }

    @GetMapping("/find/{id}")
    public Response findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @GetMapping("/delete/{id}")
    public Response deleteById(@PathVariable("id") Long id){
        return userService.deleteById(id);
    }

    @PostMapping("/update/{id}")
    public Response updateUser (@PathVariable("id") Long id, @RequestBody User user){
        return userService.update(user, id);
    }

    @GetMapping("/active/{active}")
    public Response findByActive(@PathVariable Boolean active){
        return userService.findByActive(active);
    }

}
