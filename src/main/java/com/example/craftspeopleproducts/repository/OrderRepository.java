package com.example.craftspeopleproducts.repository;

import com.example.craftspeopleproducts.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
