package com.pmo.db.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "store_reviews")
public class StoreReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private VendorStore vendorStore;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private User customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private MenuItem menuItem;

    @Column(name = "product_rating", nullable = false)
    private Integer productRating;

    @Column(name = "store_rating", nullable = false)
    private Integer storeRating;

    @Column(name = "comments", length = 50)
    private String comments;

    @Column(name = "review_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP", nullable = false)
    private java.time.LocalDateTime reviewDate;

    // Add getter and setter me
}