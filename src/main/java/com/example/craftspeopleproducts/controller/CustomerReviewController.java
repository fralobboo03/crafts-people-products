package com.example.craftspeopleproducts.controller;

import com.example.craftspeopleproducts.entity.CustomerReview;
import com.example.craftspeopleproducts.service.CustomerReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-reviews")
public class CustomerReviewController {
    @Autowired
    private CustomerReviewService customerReviewService;

    @GetMapping
    public List<CustomerReview> getAllCustomerReviews() {
        return customerReviewService.getAllCustomerReviews();
    }

    @GetMapping("/{id}")
    public CustomerReview getCustomerReviewById(@PathVariable Long id) {
        return customerReviewService.getCustomerReviewById(id);
    }

    @PostMapping
    public CustomerReview createCustomerReview(@RequestBody CustomerReview customerReview) {
        return customerReviewService.createCustomerReview(customerReview);
    }

    @PutMapping("/{id}")
    public CustomerReview updateCustomerReview(@PathVariable Long id, @RequestBody CustomerReview customerReview) {
        return customerReviewService.updateCustomerReview(id, customerReview);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomerReview(@PathVariable Long id) {
        customerReviewService.deleteCustomerReview(id);
        return ResponseEntity.noContent().build();
    }
}
