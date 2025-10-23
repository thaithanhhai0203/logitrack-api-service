package com.logitrack.order.controller;

import com.logitrack.common.response.ApiResponse;
import com.logitrack.order.dto.OrderRequest;
import com.logitrack.order.dto.OrderResponse;
import com.logitrack.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public ApiResponse<List<OrderResponse>> getAllOrders() {
        return ApiResponse.ok(orderService.getAllOrders());
    }

    @PostMapping
    public ApiResponse<OrderResponse> createOrder(@RequestBody OrderRequest request) {
        return ApiResponse.ok(orderService.createOrder(request));
    }
}
