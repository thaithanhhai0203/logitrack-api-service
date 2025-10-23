package com.logitrack.order.service.implement;

import com.logitrack.order.dto.OrderRequest;
import com.logitrack.order.dto.OrderResponse;
import com.logitrack.order.service.OrderService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderResponse> getAllOrders() {
        return Collections.emptyList();
    }

    @Override
    public OrderResponse createOrder(OrderRequest request) {
        return new OrderResponse(1L, request.getOrderName(), "CREATED");
    }
}
