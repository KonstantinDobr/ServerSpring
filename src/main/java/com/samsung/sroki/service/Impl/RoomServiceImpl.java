package com.samsung.sroki.service.Impl;

import com.samsung.sroki.dao.RoomDao;
import com.samsung.sroki.domain.Product;
import com.samsung.sroki.domain.Room;
import com.samsung.sroki.domain.User;
import com.samsung.sroki.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.schema.Example;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomDao roomDao;

    @Override
    public Room find(String login) {
        Room room = roomDao.findByLogin(login);
        if (room == null) throw new RuntimeException("Room with login " + login + " not found");
        return room;
    }

    @Override
    public Room save(Room room) {
        return roomDao.save(room);
    }

    @Override
    public ArrayList<Long> getUsers(String login) {
        Room room = find(login);

        return room.getUserList();
    }

    @Override
    public Room addUser(String login, long userId) {
        Room room = find(login);
        ArrayList<Long> userList = room.getUserList();
        userList.add(userId);
        room.setUserList(userList);

        return roomDao.save(room);
    }

    @Override
    public Room deleteUser(String login, long userId) {
        Room room = find(login);
        ArrayList<Long> userList = room.getUserList();
        userList.remove(userId);
        room.setUserList(userList);

        return roomDao.save(room);
    }

    @Override
    public ArrayList<Long> getProducts(String login) {
        Room room = find(login);
        if (room == null) throw new RuntimeException("Room with id " + login + " not found");

        return room.getProductList();
    }
}
