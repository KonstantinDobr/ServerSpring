package com.samsung.sroki.service.Impl;

import com.samsung.sroki.dao.RoomDao;
import com.samsung.sroki.dao.UserDao;
import com.samsung.sroki.domain.Product;
import com.samsung.sroki.domain.Room;
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


    @Override
    public User add(User user) {
        return userDao.save(user);
    }

    @Override
    public ArrayList<Product> getProducts(long id) {
        Optional<User> userOptional = userDao.findById(id);
        if (!userOptional.isPresent()) throw new RuntimeException("User with ID " + id + " not found");

        Optional<Room> roomOptional = roomDao.findById(userOptional.get().getId());
        if (!roomOptional.isPresent()) throw new RuntimeException("Room with ID " + id + " not found");

        return roomOptional.get().getProductList();
    }
}
