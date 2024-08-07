package com.example.craftspeopleproducts.repository;

import com.example.craftspeopleproducts.entity.Craftsperson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CraftspersonRepository extends JpaRepository<Craftsperson, Long> {
}
