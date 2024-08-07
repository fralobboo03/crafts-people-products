package com.example.craftspeopleproducts.controller;

import com.example.craftspeopleproducts.entity.Craftsperson;
import com.example.craftspeopleproducts.service.CraftspersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/craftspeople")
public class CraftspersonController {
    @Autowired
    private CraftspersonService craftspersonService;

    @GetMapping
    public List<Craftsperson> getAllCraftspeople() {
        return craftspersonService.getAllCraftspeople();
    }

    @GetMapping("/{id}")
    public Craftsperson getCraftspersonById(@PathVariable Long id) {
        return craftspersonService.getCraftspersonById(id);
    }

    @PostMapping
    public Craftsperson createCraftsperson(@RequestBody Craftsperson craftsperson) {
        return craftspersonService.createCraftsperson(craftsperson);
    }

    @PutMapping("/{id}")
    public Craftsperson updateCraftsperson(@PathVariable Long id, @RequestBody Craftsperson craftsperson) {
        return craftspersonService.updateCraftsperson(id, craftsperson);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCraftsperson(@PathVariable Long id) {
        craftspersonService.deleteCraftsperson(id);
        return ResponseEntity.noContent().build();
    }
}
