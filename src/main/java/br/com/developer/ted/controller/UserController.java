package br.com.developer.ted.controller;

import br.com.developer.ted.entity.User;
import br.com.developer.ted.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping(value = "/{id}")
    public User getById(@PathVariable long id) {
        return service.getById(id);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return service.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable long id, @RequestBody User user) {
        service.update(id, user);
    }
}
