package com.example.craftspeopleproducts.entity;

import jakarta.persistence.*;

@Entity
public class CustomerReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerReviewId;

    private String detail;
    private String rating;
    private String otherDetails;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Long getCustomerReviewId() {
        return customerReviewId;
    }

    public void setCustomerReviewId(Long customerReviewId) {
        this.customerReviewId = customerReviewId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // Getters and Setters
    
}
