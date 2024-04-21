package com.samsung.sroki.service;

import com.samsung.sroki.domain.Room;

import java.util.ArrayList;

public interface RoomService {

    Room find(String id);

    Room save(Room room);

    ArrayList<Long> getUsers(String id);

    Room addUser(String id, long userId);

    Room deleteUser(String id, long userId);

    ArrayList<Long> getProducts(String id);
}
