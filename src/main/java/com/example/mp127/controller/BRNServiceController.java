package com.example.mp127.controller;

import com.example.mp127.entities.BRNServiceT;
import com.example.mp127.entities.BRN_Temp;
import com.example.mp127.entities.request.addNewBRNServiceEntry;
import com.example.mp127.service.BRNServiceServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path="/brn")
public class BRNServiceController {
    private final BRNServiceServices brnServiceServices;

    @PostMapping(path="/brnRecord")
    public @ResponseBody BRNServiceT addBookingId(@RequestBody addNewBRNServiceEntry primaryKeys){
        return brnServiceServices.addNewBookingIDEntry(primaryKeys);
    }
}