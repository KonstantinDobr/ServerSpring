package com.samsung.sroki.controller;

import com.samsung.sroki.domain.Room;
import com.samsung.sroki.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/room/get/{id}")
    public Room get(String id) {
        return roomService.find(id);
    }

    @PostMapping("/room/save")
    public Room save(@RequestBody Room room) {
        System.out.println("Save");
        return roomService.save(room);
    }

    @GetMapping("/room/users/{login}")
    public ArrayList<Long> getUsers(@PathVariable String login) {
        return roomService.getUsers(login);
    }

    @PostMapping("/room/save_user/{userId}")
    public Room add(@RequestBody String id, @PathVariable long userId) {
        return roomService.addUser(id, userId);
    }

    @PostMapping("/room/delete_user")
    public Room delete(@RequestBody String id, long userId) {
        return roomService.deleteUser(id, userId);
    }

    @GetMapping("/room/products/{login}")
    public ArrayList<Long> getProducts(@PathVariable String login) {
        return roomService.getProducts(login);
    }

}
