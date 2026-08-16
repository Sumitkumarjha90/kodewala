package com.zepto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.zepto.entity.OrderEntity;
import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // 1. CREATE: POST /order/place
    @PostMapping("/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest) {
        OrderResponse orderResponse = orderService.acceptOrder(orderRequest);
        return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);
    }

    // 2. READ ALL: GET /order
    @GetMapping
    public ResponseEntity<List<OrderEntity>> getAllOrders() {
        List<OrderEntity> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    // 3. READ ONE: GET /order/{id}
    @GetMapping("/{id}")
    public ResponseEntity<OrderEntity> getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 4. UPDATE: PUT /order/{id}
    @PutMapping("/{id}")
    public ResponseEntity<OrderEntity> updateOrder(@PathVariable int id, @RequestBody OrderRequest orderRequest) {
        return orderService.updateOrder(id, orderRequest)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 5. DELETE: DELETE /order/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable int id) {
        boolean deleted = orderService.deleteOrderById(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}