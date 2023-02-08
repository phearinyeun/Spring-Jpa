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
        return userService.createUser(user);
    }

    @GetMapping
    public Response getAllUser(User user){
        return userService.getAllUser(user);
    }

    @GetMapping("/find/{id}")
    public Response findById(@RequestBody @PathVariable("id") Long id){
        return userService.findById(id);
    }

    @GetMapping("/delete/{id}")
    public Response deleteById(@PathVariable("id") Long id){
        return userService.deleteById(id);
    }

    @PostMapping("/update/{id}")
    public Response updateUser (@RequestBody @PathVariable("id") Long id, User user){
        return userService.update(user, id);
    }

    @GetMapping("/active/{active}")
    public Response findByActiveFalse(@RequestBody @PathVariable("active") Boolean active){
        return new Response(200, "Success", userService.findByActiveFalse());
    }
}
