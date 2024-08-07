package com.example.craftspeopleproducts.entity;

import jakarta.persistence.*;

@Entity
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imageId;

    private String image;
    private String detailImage;
    private String otherDetails;
    public Long getImageId() {
        return imageId;
    }
    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getDetailImage() {
        return detailImage;
    }
    public void setDetailImage(String detailImage) {
        this.detailImage = detailImage;
    }
    public String getOtherDetails() {
        return otherDetails;
    }
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    // Getters and Setters
    
}
