package com.example.craftspeopleproducts.service;

import com.example.craftspeopleproducts.entity.Craftsperson;
import com.example.craftspeopleproducts.repository.CraftspersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CraftspersonService {
    @Autowired
    private CraftspersonRepository craftspersonRepository;

    public List<Craftsperson> getAllCraftspeople() {
        return craftspersonRepository.findAll();
    }

    public Craftsperson getCraftspersonById(Long id) {
        return craftspersonRepository.findById(id).orElse(null);
    }

    public Craftsperson createCraftsperson(Craftsperson craftsperson) {
        return craftspersonRepository.save(craftsperson);
    }

    public Craftsperson updateCraftsperson(Long id, Craftsperson craftsperson) {
        if (craftspersonRepository.existsById(id)) {
            craftsperson.setCraftspersonId(id);
            return craftspersonRepository.save(craftsperson);
        }
        return null;
    }

    public void deleteCraftsperson(Long id) {
        craftspersonRepository.deleteById(id);
    }
}
