package com.example.craftspeopleproducts.repository;

import com.example.craftspeopleproducts.entity.CustomerReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReviewRepository extends JpaRepository<CustomerReview, Long> {
}
