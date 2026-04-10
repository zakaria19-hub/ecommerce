package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Produit;
import com.example.ecommerce.service.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {

    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public List<Produit> getAll() {
        return produitService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Produit> getById(@PathVariable Long id) {
        return produitService.getById(id);
    }

    @PostMapping
    public Produit create(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @PutMapping("/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
        Optional<Produit> existing = produitService.getById(id);
        if (existing.isPresent()) {
            Produit p = existing.get();
            p.setNom(produit.getNom());
            p.setDescription(produit.getDescription());
            p.setPrix(produit.getPrix());
            p.setStock(produit.getStock());
            return produitService.save(p);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produitService.delete(id);
    }
}