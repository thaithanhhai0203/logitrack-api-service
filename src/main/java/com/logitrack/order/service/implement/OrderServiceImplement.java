package com.logitrack.order.service.implement;

import java.util.List;

import com.logitrack.order.dto.OrderRequest;
import com.logitrack.order.dto.OrderResponse;
import com.logitrack.order.service.OrderService;

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
