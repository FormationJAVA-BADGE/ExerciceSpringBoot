package com.example.TP1_SPRING.model;

public class Produit {

    private String libelle;

    public Produit(String libelle) {
        this.libelle = libelle;
    }

    public Produit() {
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
