package com.educandoweb.nelio.repositories;

import com.educandoweb.nelio.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
