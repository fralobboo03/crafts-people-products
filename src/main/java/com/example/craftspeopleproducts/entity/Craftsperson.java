package com.example.craftspeopleproducts.entity;

import jakarta.persistence.*;

@Entity
public class Craftsperson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long craftspersonId;

    private String craftspersonName;
    private String address;
    private String contact;
    private String history;
    private String description;
    public Long getCraftspersonId() {
        return craftspersonId;
    }
    public void setCraftspersonId(Long craftspersonId) {
        this.craftspersonId = craftspersonId;
    }
    public String getCraftspersonName() {
        return craftspersonName;
    }
    public void setCraftspersonName(String craftspersonName) {
        this.craftspersonName = craftspersonName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getHistory() {
        return history;
    }
    public void setHistory(String history) {
        this.history = history;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Getters and Setters
    
}
