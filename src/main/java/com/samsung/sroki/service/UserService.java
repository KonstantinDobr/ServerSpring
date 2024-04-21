package com.samsung.sroki.service;

import com.samsung.sroki.domain.User;

import java.util.ArrayList;

public interface UserService {
    User save(User user);

    ArrayList<Long> getProducts(long id);

    boolean check(long id);
}
