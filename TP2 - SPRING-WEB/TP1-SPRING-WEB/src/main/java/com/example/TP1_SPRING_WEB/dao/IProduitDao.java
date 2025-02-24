package com.example.TP1_SPRING_WEB.dao;

import com.example.TP1_SPRING_WEB.model.Produit;

import java.util.List;

public interface IProduitDao {

    List<Produit> findAllProduit();
    Produit findProduit( int id);

}
