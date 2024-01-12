package com.example.mp127.controller;

import com.example.mp127.entities.BRNRoom;
import com.example.mp127.entities.request.addNewBRNRoomEntry;
import com.example.mp127.service.BRNRoomService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path="/brn")
public class BRNRoomController {
    private final BRNRoomService brnRoomService;

    @PostMapping(path="/brnRecord")
    public @ResponseBody BRNRoom addPrimaryIds(@RequestBody addNewBRNRoomEntry primaryKeys)
    {
        return brnRoomService.addPrimaryIds(primaryKeys);
    }
}
