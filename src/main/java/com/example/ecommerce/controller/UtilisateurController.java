package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Utilisateur;
import com.example.ecommerce.service.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping
    public List<Utilisateur> getAll() {
        return utilisateurService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Utilisateur> getById(@PathVariable Long id) {
        return utilisateurService.getById(id);
    }

    @PostMapping
    public Utilisateur create(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    @PutMapping("/{id}")
    public Utilisateur update(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
        Optional<Utilisateur> existing = utilisateurService.getById(id);
        if (existing.isPresent()) {
            Utilisateur u = existing.get();
            u.setNom(utilisateur.getNom());
            u.setEmail(utilisateur.getEmail());
            u.setAdresse(utilisateur.getAdresse());
            return utilisateurService.save(u);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        utilisateurService.delete(id);
    }
}