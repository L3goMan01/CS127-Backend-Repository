package com.example.mp127.service;

import com.example.mp127.entities.BRN_Serv;
import com.example.mp127.entities.request.addNewBRNService;

public interface BRN_ServService {
    BRN_Serv addNewBRNService(addNewBRNService brnServiceToAdd);
}
