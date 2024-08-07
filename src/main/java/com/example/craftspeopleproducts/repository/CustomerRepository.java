package com.example.craftspeopleproducts.repository;

import com.example.craftspeopleproducts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
