package com.example.mp127.service;

import com.example.mp127.entities.BRNServiceT;
import com.example.mp127.entities.request.addNewBRNServiceEntry;
import com.example.mp127.repository.BRNServicesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BRNServiceServicesImpl implements BRNServiceServices{
    private final BRNServicesRepository brnServicesRepository;

    @Override
    public BRNServiceT addNewBookingIDEntry(addNewBRNServiceEntry primaryKeys){
        return brnServicesRepository.save(primaryKeys.mapToBRNServices());}
}
