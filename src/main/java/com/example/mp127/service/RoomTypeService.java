package com.example.mp127.service;

import com.example.mp127.entities.RoomType;

import java.util.List;

public interface RoomTypeService {
    List<RoomType> getAllRoomTypes();
    RoomType getRoomType(Long id);
}
