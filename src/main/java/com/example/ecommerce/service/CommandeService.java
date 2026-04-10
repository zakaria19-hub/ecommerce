package com.example.ecommerce.service;

import com.example.ecommerce.entity.Commande;
import com.example.ecommerce.repository.CommandeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeService {

    private final CommandeRepository commandeRepository;

    public CommandeService(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    public List<Commande> getAll() {
        return commandeRepository.findAll();
    }

    public Optional<Commande> getById(Long id) {
        return commandeRepository.findById(id);
    }

    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }

    public void delete(Long id) {
        commandeRepository.deleteById(id);
    }
}