package com.example.mp127.controller;

import com.example.mp127.entities.RoomType;
import com.example.mp127.service.RoomTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms/type")
public class RoomTypeController {
    private final RoomTypeService roomTypeService;

    @GetMapping(path = "/all")
    public List<RoomType> getAllRoomTypes() {
        return roomTypeService.getAllRoomTypes();
    }

    @GetMapping(path = "/{Id}")
    public RoomType getRoomType(@PathVariable Long Id) {
        return roomTypeService.getRoomType(Id);
    }
}
