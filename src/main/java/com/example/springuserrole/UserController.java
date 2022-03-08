package com.example.springuserrole;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
@Transactional
public class UserController {
    private UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<User> all() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User one(@PathVariable Long id) {
        return repository.findById(id).get();
    }
}
