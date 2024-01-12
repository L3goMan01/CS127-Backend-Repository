package com.example.mp127.entities.request;

import com.example.mp127.entities.BRNRoom;
import com.example.mp127.entities.Booking;
import com.example.mp127.entities.Room;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class addNewBRNRoomEntry {

    private Booking brnId;

    private Room roomNum;

    public BRNRoom mapToBRNRoom(){
        return new BRNRoom(brnId.getBookingId(), roomNum.getRoomNumber());
    }
}
