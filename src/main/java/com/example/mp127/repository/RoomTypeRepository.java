package com.example.mp127.repository;

import com.example.mp127.entities.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType,Long> {
    RoomType findByRoomTypeId(Long id);
}
