package com.example.TP1_SPRING_WEB.service;

import com.example.TP1_SPRING_WEB.model.Produit;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IProduitService {

    List<Produit> findAllProduit();
    Produit findProduit( int id);
}
