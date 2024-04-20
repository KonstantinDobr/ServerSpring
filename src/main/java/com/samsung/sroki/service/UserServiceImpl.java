package com.samsung.sroki.service;

import com.samsung.sroki.dao.UserDao;
import com.samsung.sroki.domain.Product;
import com.samsung.sroki.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public User add(User user) {
        return userDao.save(user);
    }

    @Override
    public User update(long id, User user) {
        Optional<User> userOptional = userDao.findById(id);
        if (!userOptional.isPresent()) throw new RuntimeException("User with ID " + id + " not found");

        User updateUser = userOptional.get();
        updateUser.setProducts(user.getProducts());
        return updateUser;
    }

    @Override
    public ArrayList<Product> getProducts(long id) {
        Optional<User> userOptional = userDao.findById(id);
        if (!userOptional.isPresent()) throw new RuntimeException("User with ID " + id + " not found");

        return userOptional.get().getProducts();
    }
}
