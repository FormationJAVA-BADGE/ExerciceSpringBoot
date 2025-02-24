package com.example.TP1_SPRING.dao;

import com.example.TP1_SPRING.model.Produit;
import org.springframework.stereotype.Repository;

@Repository
public class ProduitDaoImpl implements IProduitDao {
    @Override
    public void createProduit(Produit p) {
        System.out.println("test dans le DAO");
    }
}
