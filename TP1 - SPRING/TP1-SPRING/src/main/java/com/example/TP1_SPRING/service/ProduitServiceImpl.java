package com.example.TP1_SPRING.service;


import com.example.TP1_SPRING.dao.IProduitDao;
import com.example.TP1_SPRING.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl implements IProduitService {


    @Autowired
    IProduitDao dao;

    @Override
    public void createProduit(Produit p) {
       dao.createProduit(p);
    }
}
