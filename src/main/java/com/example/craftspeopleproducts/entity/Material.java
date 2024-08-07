package com.example.craftspeopleproducts.entity;

import jakarta.persistence.*;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long materialId;

    private String nameMaterial;
    private String typeMaterial;
    private String source;
    private String otherDetails;
    public Long getMaterialId() {
        return materialId;
    }
    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }
    public String getNameMaterial() {
        return nameMaterial;
    }
    public void setNameMaterial(String nameMaterial) {
        this.nameMaterial = nameMaterial;
    }
    public String getTypeMaterial() {
        return typeMaterial;
    }
    public void setTypeMaterial(String typeMaterial) {
        this.typeMaterial = typeMaterial;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getOtherDetails() {
        return otherDetails;
    }
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    // Getters and Setters
    
}
