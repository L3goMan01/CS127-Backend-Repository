package com.example.mp127.service;

import com.example.mp127.entities.BRN_Serv;
import com.example.mp127.entities.request.addNewBRNService;
import com.example.mp127.repository.BRN_ServRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BRN_ServServiceImpl implements BRN_ServService{
    private final BRN_ServRepository brnServRepository;

    @Override
    public BRN_Serv addNewBRNService(addNewBRNService brnServiceToAdd) {
        return brnServRepository.save(brnServiceToAdd.mapToBRN_Serv());
    }
}
