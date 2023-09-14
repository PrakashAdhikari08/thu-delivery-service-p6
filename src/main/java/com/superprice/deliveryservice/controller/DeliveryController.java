package com.superprice.deliveryservice.controller;


import com.superprice.deliveryservice.dto.OrderDto;
import com.superprice.deliveryservice.service.DeliveryService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/all")
    public List<OrderDto> getDeliveryDetails() {

        return deliveryService.getAllDelivery() ;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDto addDelivery(@RequestBody OrderDto orderDto) {
        return deliveryService.addDelivery(orderDto);
    }
}
