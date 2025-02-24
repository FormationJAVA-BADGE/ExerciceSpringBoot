package com.example.TP1_SPRING_WEB.model;

public class Produit {

    private String libelle;
    private double prix;
    private String isbn;

    public Produit(String libelle, double prix, String isbn) {
        this.libelle = libelle;
        this.prix = prix;
        this.isbn = isbn;
    }

    public Produit() {
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
