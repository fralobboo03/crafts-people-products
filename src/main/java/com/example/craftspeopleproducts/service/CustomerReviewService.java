package com.example.craftspeopleproducts.service;

import com.example.craftspeopleproducts.entity.CustomerReview;
import com.example.craftspeopleproducts.repository.CustomerReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerReviewService {
    @Autowired
    private CustomerReviewRepository customerReviewRepository;

    public List<CustomerReview> getAllCustomerReviews() {
        return customerReviewRepository.findAll();
    }

    public CustomerReview getCustomerReviewById(Long id) {
        return customerReviewRepository.findById(id).orElse(null);
    }

    public CustomerReview createCustomerReview(CustomerReview customerReview) {
        return customerReviewRepository.save(customerReview);
    }

    public CustomerReview updateCustomerReview(Long id, CustomerReview customerReview) {
        if (customerReviewRepository.existsById(id)) {
            customerReview.setCustomerReviewId(id);
            return customerReviewRepository.save(customerReview);
        }
        return null;
    }

    public void deleteCustomerReview(Long id) {
        customerReviewRepository.deleteById(id);
    }
}
