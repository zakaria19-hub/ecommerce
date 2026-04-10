package com.example.ecommerce.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateCommande;
    private double total;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    public Commande() {
    }

    public Commande(LocalDate dateCommande, double total, Utilisateur utilisateur) {
        this.dateCommande = dateCommande;
        this.total = total;
        this.utilisateur = utilisateur;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public void setId(Long id) {
        this.id = id;
    }
}