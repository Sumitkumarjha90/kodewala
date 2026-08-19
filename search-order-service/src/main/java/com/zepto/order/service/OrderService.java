package com.zepto.order.service;

import java.util.List;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
import com.zepto.order.repository.OrderRepository;
import com.zepto.order.response.OrderResponse;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public OrderResponse getOrderById(int orderId) {

		System.out.println("OrderService.getOrderById()::::::::::::::::::::: START");

		// OrderEntity entity = orderRepository.findById(orderId).get();

		OrderEntity entity = orderRepository.findOrdersByOrderId(orderId);

		OrderResponse response = new OrderResponse();
		response.setId(entity.getId());
		response.setCustomerId(entity.getCustomerId());
		response.setOrderId(entity.getOrderId());
		response.setProductId(entity.getProductId());
		response.setQuantity(entity.getQuantity());

		System.out.println("OrderService.getOrderById()::::::::::::::::::::: END");

		return response;
	}

	public List<OrderResponse> listOrdersByPayment(String paymentType) {
		List<OrderEntity> orderEntity = orderRepository.findOrdersByPaymentType(paymentType);

		List<OrderResponse> response = new ArrayList<OrderResponse>();

		for (OrderEntity entity : orderEntity) {

			OrderResponse orderResponse = new OrderResponse();

			orderResponse.setId(entity.getId());
			orderResponse.setCustomerId(entity.getCustomerId());
			orderResponse.setOrderId(entity.getOrderId());
			orderResponse.setProductId(entity.getProductId());
			orderResponse.setQuantity(entity.getQuantity());
			orderResponse.setPaymentMethod(entity.getPaymentMethod());

			response.add(orderResponse);
		} 
		return response;

	}
}
