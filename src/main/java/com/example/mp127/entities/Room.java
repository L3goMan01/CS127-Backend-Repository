package com.example.mp127.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name="ROOM")
public class Room {
    @Id
    private Long roomNumber;
    private Long roomTypeId;
    private String description;
    private String typeOfBeds;
    private Long numberOfBeds;

    public Room(Long roomNumber, Long roomTypeId, String description, String typeOfBeds, Long numberOfBeds) {
        this.roomNumber = roomNumber;
        this.roomTypeId = roomTypeId;
        this.description = description;
        this.typeOfBeds = typeOfBeds;
        this.numberOfBeds = numberOfBeds;
    }
}
