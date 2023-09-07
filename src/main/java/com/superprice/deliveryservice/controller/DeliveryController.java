package com.superprice.deliveryservice.controller;


import com.superprice.deliveryservice.service.DeliveryService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/get-by-order-id")
    public String getDeliveryDetails() {
        String order = deliveryService.GetOrderById(2);
        return order ;
    }
}
