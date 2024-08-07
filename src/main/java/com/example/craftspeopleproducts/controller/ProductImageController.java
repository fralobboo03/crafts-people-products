package com.example.craftspeopleproducts.controller;

import com.example.craftspeopleproducts.entity.ProductImage;
import com.example.craftspeopleproducts.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-images")
public class ProductImageController {
    @Autowired
    private ProductImageService productImageService;

    @GetMapping
    public List<ProductImage> getAllProductImages() {
        return productImageService.getAllProductImages();
    }

    @GetMapping("/{id}")
    public ProductImage getProductImageById(@PathVariable Long id) {
        return productImageService.getProductImageById(id);
    }

    @PostMapping
    public ProductImage createProductImage(@RequestBody ProductImage productImage) {
        return productImageService.createProductImage(productImage);
    }

    @PutMapping("/{id}")
    public ProductImage updateProductImage(@PathVariable Long id, @RequestBody ProductImage productImage) {
        return productImageService.updateProductImage(id, productImage);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductImage(@PathVariable Long id) {
        productImageService.deleteProductImage(id);
        return ResponseEntity.noContent().build();
    }
}
