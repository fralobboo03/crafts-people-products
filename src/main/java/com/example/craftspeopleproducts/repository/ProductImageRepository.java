package com.example.craftspeopleproducts.repository;

import com.example.craftspeopleproducts.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}
