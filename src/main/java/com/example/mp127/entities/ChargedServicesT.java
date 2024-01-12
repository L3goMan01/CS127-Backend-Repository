package com.example.mp127.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity(name = "CHARGED_SERVICES")
public class ChargedServicesT {

    @Id
    private Long chargedServicesId;

    private Long employeeId;
    private Long serviceId;
    private Long price;
    private String notes;

    public ChargedServicesT(Long chargedServicesId, Long employeeId, Long serviceId, Long price, String notes) {
        this.chargedServicesId = chargedServicesId;
        this.employeeId = employeeId;
        this.serviceId = serviceId;
        this.price = price;
        this.notes = notes;
    }
}
