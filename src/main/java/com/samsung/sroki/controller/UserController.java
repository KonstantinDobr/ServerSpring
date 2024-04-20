package com.samsung.sroki.controller;

import com.samsung.sroki.domain.Product;
import com.samsung.sroki.domain.User;
import com.samsung.sroki.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public User add(@RequestBody User user) {
        return userService.add(user);
    }

    @PutMapping("/user/{id}")
    public User update(@PathVariable long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @GetMapping("/user/{id}")
    public ArrayList<Product> getProducts(@PathVariable long id) {
        return userService.getProducts(id);
    }
}
