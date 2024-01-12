package com.example.mp127.service;

import com.example.mp127.entities.BRNRoom;
import com.example.mp127.entities.request.addNewBRNRoomEntry;

public interface BRNRoomService {
    BRNRoom addPrimaryIds(addNewBRNRoomEntry primaryKeys);
}
