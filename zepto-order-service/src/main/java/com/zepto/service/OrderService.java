package com.zepto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // --- CREATE ---
    public OrderResponse acceptOrder(OrderRequest orderRequest) {
        OrderEntity entity = new OrderEntity();
        entity.setCustomerId(orderRequest.getCustomerId());
        entity.setPaymentMethod(orderRequest.getPaymentMethod());
        entity.setProductId(orderRequest.getProductId());
        entity.setQuantity(orderRequest.getQuantity());
        entity.setShippingAddress(orderRequest.getShippingAddress());
        entity.setOrderId(generateOrderID());

        OrderEntity savedEntity = orderRepository.save(entity);

        return mapToResponse(savedEntity, "SUCCESS", "PLACED");
    }

    // --- READ (Find All) ---
    public List<OrderEntity> getAllOrders() {
        List<OrderEntity> orders = new ArrayList<>();
        orderRepository.findAll().forEach(orders::add);
        return orders;
    }

    // --- READ (Find by ID) ---
    public Optional<OrderEntity> getOrderById(int id) {
        return orderRepository.findById(id);
    }

    // --- UPDATE ---
    public Optional<OrderEntity> updateOrder(int id, OrderRequest orderRequest) {
        Optional<OrderEntity> existingOrderOptional = orderRepository.findById(id);

        if (existingOrderOptional.isPresent()) {
            OrderEntity existingOrder = existingOrderOptional.get();
            if (orderRequest.getCustomerId() != 0) existingOrder.setCustomerId(orderRequest.getCustomerId());
            if (orderRequest.getProductId() != 0) existingOrder.setProductId(orderRequest.getProductId());
            if (orderRequest.getQuantity() != 0) existingOrder.setQuantity(orderRequest.getQuantity());
            if (orderRequest.getPaymentMethod() != null) existingOrder.setPaymentMethod(orderRequest.getPaymentMethod());
            if (orderRequest.getShippingAddress() != null) existingOrder.setShippingAddress(orderRequest.getShippingAddress());

            return Optional.of(orderRepository.save(existingOrder));
        }

        return Optional.empty();
    }

    // --- DELETE ---
    public boolean deleteOrderById(int id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private OrderResponse mapToResponse(OrderEntity entity, String paymentStatus, String orderStatus) {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderId(entity.getOrderId());
        orderResponse.setCustomerId(entity.getCustomerId());
        orderResponse.setTotalAmount(2312); // Business calculation
        orderResponse.setPaymentStatus(paymentStatus);
        orderResponse.setOrderStatus(orderStatus);
        return orderResponse;
    }

    private int generateOrderID() {
        Random random = new Random();
        return 10000 + random.nextInt(90000);
    }
}