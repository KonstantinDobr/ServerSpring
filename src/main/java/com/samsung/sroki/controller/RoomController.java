package com.samsung.sroki.controller;

import com.samsung.sroki.domain.Product;
import com.samsung.sroki.domain.Room;
import com.samsung.sroki.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @PostMapping("/room")
    public Room add(@RequestBody Room room) {return roomService.add(room);}

    @GetMapping("/room/{id}")
    public ArrayList<Long> getUsers(@PathVariable long id) {return roomService.getUsers(id);}

    @PostMapping("/room/add_user")
    public Room add(@RequestBody long id, long userId) {return roomService.addUser(id, userId);}

    @PostMapping("/room/delete_user")
    public Room delete(@RequestBody long id, long userId) {return roomService.deleteUser(id, userId);}

    @GetMapping("/room/get_products/{id}")
    public ArrayList<Product> getProducts(@PathVariable long id) {return roomService.getProducts(id);}

}
