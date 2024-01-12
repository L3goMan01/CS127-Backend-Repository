package com.example.mp127.controller;

import com.example.mp127.entities.BRN_Serv;
import com.example.mp127.entities.request.addNewBRNService;
import com.example.mp127.service.BRN_ServService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="/brnservice")
public class BRN_ServController {
    private final BRN_ServService brnService;

    @PostMapping(path="/add_BRN_Service")
    public @ResponseBody BRN_Serv addNewBRNService(@RequestBody addNewBRNService brnServiceToAdd)
    {
        return brnService.addNewBRNService(brnServiceToAdd);
    }
}
