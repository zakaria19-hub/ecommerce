package com.example.ecommerce.repository;

import com.example.ecommerce.entity.CommandeProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeProduitRepository extends JpaRepository<CommandeProduit, Long> {
}