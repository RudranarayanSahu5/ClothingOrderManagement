package com.example.clothingapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clothing_orders") 
public class ClothingOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String customerName;
    private String productName; 
    private String size;        
    private int quantity;
    private double price;
    private String status; 

    // Getters and Setters
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
