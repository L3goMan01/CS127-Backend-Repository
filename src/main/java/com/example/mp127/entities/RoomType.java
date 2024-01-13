package com.example.mp127.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Entity(name = "ROOM_TYPE")
@Getter
@Setter
public class RoomType {
    @Id
    private Long roomTypeId;

    private String typeName;

    private Long price;

    private Long maxGuests;

    private Long area;

    public RoomType(Long roomTypeId, String typeName, Long price, Long maxGuests,
    Long area) {
        this.roomTypeId = roomTypeId;
        this.typeName = typeName;
        this.price = price;
        this.maxGuests = maxGuests;
        this.area = area;
    }
}
