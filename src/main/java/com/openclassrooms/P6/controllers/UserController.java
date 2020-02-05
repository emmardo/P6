package com.openclassrooms.P6.controllers;

import com.openclassrooms.P6.models.User;
import com.openclassrooms.P6.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository repo;

    @Autowired
    public UserController(UserRepository repository) {
        this.repo = repository;
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
