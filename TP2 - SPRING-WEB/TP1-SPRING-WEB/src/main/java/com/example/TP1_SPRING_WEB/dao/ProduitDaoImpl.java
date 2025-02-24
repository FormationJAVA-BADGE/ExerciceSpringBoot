package com.example.TP1_SPRING_WEB.dao;

import com.example.TP1_SPRING_WEB.model.Produit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProduitDaoImpl implements IProduitDao {
    @Override
    public List<Produit> findAllProduit() {

        List<Produit> produits=new ArrayList<>();

        for(int i=0; i<20;i++){
            produits.add(new Produit("livre "+ i,40.00, "343221122" ));
        }
        return produits;
    }

    @Override
    public Produit findProduit(int id) {
        return new Produit("livre "+id, 50.89, "4543646");
    }
}
