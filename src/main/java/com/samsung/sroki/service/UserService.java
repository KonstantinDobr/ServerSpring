package com.samsung.sroki.service;

import com.samsung.sroki.domain.Product;
import com.samsung.sroki.domain.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    User add(User user);

    User update(long id, User user);

    ArrayList<Product> getProducts(long id);
}
