package com.pmo.db.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private User customer;

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private VendorStore vendorStore;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status", nullable = false)
    private OrderStatus orderStatus;

    @Column(name = "total_cost", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalCost;

    @Column(name = "order_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP", nullable = false)
    private java.time.LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private MenuItem menuItem;

    @Column(name = "order_otp", length = 50)
    private String orderOtp;

    @Column(name = "amount_status", length = 10)
    private String amountStatus;

    // Add getter and setter methods

    // Optional: You may want to add additional annotations or configurations as needed.
}
