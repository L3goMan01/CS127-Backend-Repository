package com.example.mp127.service;

import com.example.mp127.entities.BRNRoom;
import com.example.mp127.entities.request.addNewBRNRoomEntry;
import com.example.mp127.repository.BRNRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BRNRoomServiceImpl implements BRNRoomService{

    private final BRNRoomRepository brnRoomRepository;

    @Override
    public BRNRoom addPrimaryIds(addNewBRNRoomEntry primaryKeys) {
        return brnRoomRepository.save(primaryKeys.mapToBRNRoom());
    }
}
