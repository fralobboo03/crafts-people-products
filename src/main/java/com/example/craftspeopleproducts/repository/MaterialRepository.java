package com.example.craftspeopleproducts.repository;

import com.example.craftspeopleproducts.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Long> {
}
