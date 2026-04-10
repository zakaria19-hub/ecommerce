package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Commande;
import com.example.ecommerce.service.CommandeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/commandes")
public class CommandeController {

    private final CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping
    public List<Commande> getAll() {
        return commandeService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Commande> getById(@PathVariable Long id) {
        return commandeService.getById(id);
    }

    @PostMapping
    public Commande create(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @PutMapping("/{id}")
    public Commande update(@PathVariable Long id, @RequestBody Commande commande) {
        Optional<Commande> existing = commandeService.getById(id);
        if (existing.isPresent()) {
            Commande c = existing.get();
            c.setDateCommande(commande.getDateCommande());
            c.setTotal(commande.getTotal());
            c.setUtilisateur(commande.getUtilisateur());
            return commandeService.save(c);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        commandeService.delete(id);
    }
}