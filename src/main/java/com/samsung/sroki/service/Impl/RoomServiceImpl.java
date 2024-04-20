package com.samsung.sroki.service.Impl;

import com.samsung.sroki.dao.RoomDao;
import com.samsung.sroki.domain.Product;
import com.samsung.sroki.domain.Room;
import com.samsung.sroki.domain.User;
import com.samsung.sroki.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomDao roomDao;

    @Override
    public Room find(long id) {
        Optional<Room> roomOptional = roomDao.findById(id);
        if (!roomOptional.isPresent()) throw new RuntimeException("Room with id " + id + " not found");
        return roomOptional.get();
    }

    @Override
    public Room add(Room room) {
        return roomDao.save(room);
    }

    @Override
    public ArrayList<Long> getUsers(long id) {
        Optional<Room> roomOptional = roomDao.findById(id);
        if (!roomOptional.isPresent()) throw new RuntimeException("Room with id " + id + " not found");

        return roomOptional.get().getUserList();
    }

    @Override
    public Room addUser(long id, long userId) {
        Optional<Room> roomOptional = roomDao.findById(id);
        if (!roomOptional.isPresent()) throw new RuntimeException("Room with id " + id + " not found");

        Room room = roomOptional.get();
        ArrayList<Long> userList = room.getUserList();
        userList.add(userId);
        room.setUserList(userList);

        return roomDao.save(room);
    }

    @Override
    public Room deleteUser(long id, long userId) {
        Optional<Room> roomOptional = roomDao.findById(id);
        if (!roomOptional.isPresent()) throw new RuntimeException("Room with id " + id + " not found");

        Room room = roomOptional.get();
        ArrayList<Long> userList = room.getUserList();
        userList.remove(userId);
        room.setUserList(userList);

        return roomDao.save(room);
    }

    @Override
    public ArrayList<Long> getProducts(long id) {
        Optional<Room> roomOptional = roomDao.findById(id);
        if (!roomOptional.isPresent()) throw new RuntimeException("Room with id " + id + " not found");

        return roomOptional.get().getProductList();
    }
}
