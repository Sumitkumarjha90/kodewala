package com.zepto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.zepto.entity.OrderEntity;
import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {
    // Custom finder method to find an entity by its generated business orderId
    Optional<OrderEntity> findByOrderId(int orderId);
    
    // Custom deletion by generated orderId
    void deleteByOrderId(int orderId);
}