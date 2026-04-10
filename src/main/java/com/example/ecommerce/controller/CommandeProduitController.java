package com.example.ecommerce.controller;

import com.example.ecommerce.dto.CommandeProduitRequest;
import com.example.ecommerce.entity.Commande;
import com.example.ecommerce.entity.CommandeProduit;
import com.example.ecommerce.entity.Produit;
import com.example.ecommerce.repository.CommandeRepository;
import com.example.ecommerce.repository.CommandeProduitRepository;
import com.example.ecommerce.repository.ProduitRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/commande-produits")
public class CommandeProduitController {

    private final CommandeProduitRepository commandeProduitRepository;
    private final CommandeRepository commandeRepository;
    private final ProduitRepository produitRepository;

    public CommandeProduitController(CommandeProduitRepository commandeProduitRepository,
                                     CommandeRepository commandeRepository,
                                     ProduitRepository produitRepository) {
        this.commandeProduitRepository = commandeProduitRepository;
        this.commandeRepository = commandeRepository;
        this.produitRepository = produitRepository;
    }

    @GetMapping
    public List<CommandeProduit> getAll() {
        return commandeProduitRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CommandeProduit> getById(@PathVariable Long id) {
        return commandeProduitRepository.findById(id);
    }

    @PostMapping
    public CommandeProduit create(@RequestBody CommandeProduitRequest request) {
        Commande commande = commandeRepository.findById(request.getCommandeId())
                .orElseThrow(() -> new RuntimeException("Commande introuvable"));

        Produit produit = produitRepository.findById(request.getProduitId())
                .orElseThrow(() -> new RuntimeException("Produit introuvable"));

        CommandeProduit cp = new CommandeProduit();
        cp.setQuantite(request.getQuantite());
        cp.setCommande(commande);
        cp.setProduit(produit);

        return commandeProduitRepository.save(cp);
    }

    @PutMapping("/{id}")
    public CommandeProduit update(@PathVariable Long id, @RequestBody CommandeProduitRequest request) {
        CommandeProduit cp = commandeProduitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("CommandeProduit introuvable"));

        Commande commande = commandeRepository.findById(request.getCommandeId())
                .orElseThrow(() -> new RuntimeException("Commande introuvable"));

        Produit produit = produitRepository.findById(request.getProduitId())
                .orElseThrow(() -> new RuntimeException("Produit introuvable"));

        cp.setQuantite(request.getQuantite());
        cp.setCommande(commande);
        cp.setProduit(produit);

        return commandeProduitRepository.save(cp);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        commandeProduitRepository.deleteById(id);
    }
}