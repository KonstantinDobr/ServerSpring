package com.samsung.sroki.service.Impl;

import com.samsung.sroki.dao.RoomDao;
import com.samsung.sroki.dao.UserDao;
import com.samsung.sroki.domain.Product;
import com.samsung.sroki.domain.User;
import com.samsung.sroki.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    private final RoomDao roomDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        return userDao.save(user);
    }

    @Override
    public ArrayList<Product> getProducts(Long id) {

    }
}
