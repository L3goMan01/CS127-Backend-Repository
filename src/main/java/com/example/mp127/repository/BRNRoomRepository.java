package com.example.mp127.repository;

import com.example.mp127.entities.BRNRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BRNRoomRepository extends JpaRepository<BRNRoom, Long> {
}
