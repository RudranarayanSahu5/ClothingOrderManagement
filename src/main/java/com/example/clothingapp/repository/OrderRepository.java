package com.example.clothingapp.repository;

import com.example.clothingapp.model.ClothingOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<ClothingOrder, Long> { }