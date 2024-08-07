package com.example.craftspeopleproducts.repository;

import com.example.craftspeopleproducts.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
