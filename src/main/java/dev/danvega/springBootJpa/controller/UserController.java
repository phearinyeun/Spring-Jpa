package dev.danvega.springBootJpa.controller;

import dev.danvega.springBootJpa.model.User;
import dev.danvega.springBootJpa.response.Response;
import dev.danvega.springBootJpa.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public Response crateUser(@RequestBody User user){
        return new Response(200, "Success", userService.createUser(user));
    }

    @GetMapping
    public Response getAllUser(User user){
        return new Response(200, "Success", userService.getAllUser(user));
    }

    @GetMapping("/find/{id}")
    public Response fitndById(@RequestBody @PathVariable("id") Long id){
        return new Response(200, "Success", userService.findById(id));
    }

    @GetMapping("/delete/{id}")
    public Response deleteById(@PathVariable("id") Long id){
        return new Response(200, "Success", userService.deleteById(id));
    }
}
