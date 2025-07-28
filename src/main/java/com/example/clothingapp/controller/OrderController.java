package com.example.clothingapp.controller;

import com.example.clothingapp.model.ClothingOrder;
import com.example.clothingapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*") // allow frontend
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<ClothingOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    @PostMapping
    public ClothingOrder addOrder(@RequestBody ClothingOrder order) {
        return orderRepository.save(order);
    }

    @PutMapping("/{id}")
    public ClothingOrder updateOrder(@PathVariable Long id, @RequestBody ClothingOrder order) {
        
        return orderRepository.save(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderRepository.deleteById(id);
    }
}