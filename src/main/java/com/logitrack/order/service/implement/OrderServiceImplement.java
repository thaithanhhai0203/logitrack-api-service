package com.logitrack.order.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.logitrack.order.dto.OrderRequest;
import com.logitrack.order.dto.OrderResponse;
import com.logitrack.order.service.OrderService;

@Service
public class OrderServiceImplement implements OrderService {

    @Override
    public List<OrderResponse> getAllOrders() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllOrders'");
    }

    @Override
    public OrderResponse createOrder(OrderRequest request) {
        throw new UnsupportedOperationException("Unimplemented method 'createOrder'");
    }

}
