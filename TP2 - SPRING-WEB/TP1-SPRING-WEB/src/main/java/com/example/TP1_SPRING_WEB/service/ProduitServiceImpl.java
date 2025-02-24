package com.example.TP1_SPRING_WEB.service;

import com.example.TP1_SPRING_WEB.dao.IProduitDao;
import com.example.TP1_SPRING_WEB.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements IProduitService {

    @Autowired
    private IProduitDao dao;

    @Override
    public List<Produit> findAllProduit() {
        return dao.findAllProduit();
    }

    @Override
    public Produit findProduit(int id) {
        return dao.findProduit(id);
    }
}
