package com.example.ecommerce.service;

import com.example.ecommerce.entity.CommandeProduit;
import com.example.ecommerce.repository.CommandeProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeProduitService {

    private final CommandeProduitRepository commandeProduitRepository;

    public CommandeProduitService(CommandeProduitRepository commandeProduitRepository) {
        this.commandeProduitRepository = commandeProduitRepository;
    }

    public List<CommandeProduit> getAll() {
        return commandeProduitRepository.findAll();
    }

    public Optional<CommandeProduit> getById(Long id) {
        return commandeProduitRepository.findById(id);
    }

    public CommandeProduit save(CommandeProduit commandeProduit) {
        return commandeProduitRepository.save(commandeProduit);
    }

    public void delete(Long id) {
        commandeProduitRepository.deleteById(id);
    }
}