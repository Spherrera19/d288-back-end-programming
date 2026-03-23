package com.example.stevend288.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseResponse {
    private final String orderTrackingNumber;

    public PurchaseResponse(String orderTrackingNumber, String orderTrackingNumber1) {

        this.orderTrackingNumber = orderTrackingNumber1;
    }
}