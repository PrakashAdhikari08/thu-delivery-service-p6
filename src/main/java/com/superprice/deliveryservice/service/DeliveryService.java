package com.superprice.deliveryservice.service;

import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    public String GetOrderById (Integer id) {
        return "Hello from DB service";
    }
}
