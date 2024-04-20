package com.samsung.sroki.service;

import com.samsung.sroki.domain.Product;
import com.samsung.sroki.domain.Room;
import com.samsung.sroki.domain.User;

import java.util.ArrayList;

public interface RoomService {

    Room find(long id);

    Room add(Room room);

    ArrayList<Long> getUsers(long id);

    Room addUser(long id, long userId);

    Room deleteUser(long id, long userId);

    ArrayList<Product> getProducts(long id);
}
