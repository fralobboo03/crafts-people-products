package com.example.craftspeopleproducts.service;

import com.example.craftspeopleproducts.entity.Material;
import com.example.craftspeopleproducts.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    public Material getMaterialById(Long id) {
        return materialRepository.findById(id).orElse(null);
    }

    public Material createMaterial(Material material) {
        return materialRepository.save(material);
    }

    public Material updateMaterial(Long id, Material material) {
        if (materialRepository.existsById(id)) {
            material.setMaterialId(id);
            return materialRepository.save(material);
        }
        return null;
    }

    public void deleteMaterial(Long id) {
        materialRepository.deleteById(id);
    }
}
