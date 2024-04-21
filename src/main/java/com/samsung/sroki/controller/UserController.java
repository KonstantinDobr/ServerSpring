package com.samsung.sroki.controller;

import com.samsung.sroki.domain.User;
import com.samsung.sroki.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user/save")
    public User save(@RequestBody User user) {
        System.out.println("SAVE USER " + user.toString());
        return userService.save(user);
    }

    @GetMapping("/user/products/{id}")
    public ArrayList<Long> getProducts(@PathVariable long id) {
        System.out.println("user pr " + id);
        return userService.getProducts(id);
    }

    @GetMapping("/user/check/{id}")
    public boolean checkUser(@PathVariable long id) {
        return userService.check(id);
    }
}
