package com.example.craftspeopleproducts.service;

import com.example.craftspeopleproducts.entity.ProductImage;
import com.example.craftspeopleproducts.repository.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageService {
    @Autowired
    private ProductImageRepository productImageRepository;

    public List<ProductImage> getAllProductImages() {
        return productImageRepository.findAll();
    }

    public ProductImage getProductImageById(Long id) {
        return productImageRepository.findById(id).orElse(null);
    }

    public ProductImage createProductImage(ProductImage productImage) {
        return productImageRepository.save(productImage);
    }

    public ProductImage updateProductImage(Long id, ProductImage productImage) {
        if (productImageRepository.existsById(id)) {
            productImage.setImageId(id);
            return productImageRepository.save(productImage);
        }
        return null;
    }

    public void deleteProductImage(Long id) {
        productImageRepository.deleteById(id);
    }
}
