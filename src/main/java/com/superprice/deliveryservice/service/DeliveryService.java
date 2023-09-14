package com.superprice.deliveryservice.service;

import com.superprice.deliveryservice.dto.OrderDto;
import com.superprice.deliveryservice.model.Order;
import com.superprice.deliveryservice.repo.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeliveryService {

    private OrderRepository orderRepository;

    public DeliveryService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String GetOrderById (Integer id) {
        return "Hello from DB service";
    }

    public OrderDto addDelivery(OrderDto orderDto) {
        Order order = Order.builder()
                .postcode(orderDto.getPostcode())
                .address(orderDto.getAddress())
                .build();
        order = orderRepository.save(order);

        return OrderDto.builder()
                .orderId(order.getOrderId())
                .address(order.getAddress())
                .postcode(order.getPostcode())
                .build();

    }

    public List<OrderDto> getAllDelivery() {
        List<Order> orders = orderRepository.findAll();
        List<OrderDto> orderDtos = new ArrayList<>();

        orders.forEach(
                order -> {
                    orderDtos.add(
                            OrderDto.builder()
                                    .orderId(order.getOrderId())
                                    .address(order.getAddress())
                                    .postcode(order.getPostcode())
                                    .build()
                    );
                }
        );

        return orderDtos;
    }
}
