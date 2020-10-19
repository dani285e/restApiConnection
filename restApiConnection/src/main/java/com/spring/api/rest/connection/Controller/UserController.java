package com.spring.api.rest.connection.Controller;

import com.spring.api.rest.connection.Entity.User;
import com.spring.api.rest.connection.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;


@RestController
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository){
        this.repository = repository;
    }

    // Aggregate root

    @GetMapping("/users")
    List<User> all(){
        return repository.findAll();
    }

    @PostMapping("/users")
    User newUser(@RequestBody User newUser){
        return repository.save(newUser);
    }

    // Single item

    @GetMapping("/users/{id}")
    User one(@PathVariable int id) {

        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }



//    @GetMapping("/users/{id}")
//    User replaceUser(@RequestBody User newUser, @PathVariable int id){
//
//        return repository.findById(id)
//                .map(user -> {
//                    user.setName(newUser.getName());
//                    user.setRole(newUser.getRole());
//                    return repository.save(user);
//                })
//                .orElseGet(() -> {
//                    newUser.setId(id);
//                    return repository.save(newUser);
//                });
//    }
//
    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable int id) {
        repository.deleteById(id);
    }
}
