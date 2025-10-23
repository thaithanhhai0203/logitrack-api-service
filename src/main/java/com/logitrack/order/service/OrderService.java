package com.logitrack.order.service;

import com.logitrack.order.dto.OrderRequest;
import com.logitrack.order.dto.OrderResponse;
import java.util.List;

public interface OrderService {
    List<OrderResponse> getAllOrders();
    OrderResponse createOrder(OrderRequest request);
}
