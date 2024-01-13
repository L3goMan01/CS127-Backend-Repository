package com.example.mp127.service;

import com.example.mp127.entities.RoomType;
import com.example.mp127.repository.RoomTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomTypeServiceImpl implements RoomTypeService{
    RoomTypeRepository roomTypeRepository;
    @Override
    public List<RoomType> getAllRoomTypes() {
        return roomTypeRepository.findAll();
    }

    @Override
    public RoomType getRoomType(Long id) {
        return roomTypeRepository.findByRoomTypeId(id);
    }
}
