package com.example.TP_ExceptionSpringDATA.Service;

import com.example.TP_ExceptionSpringDATA.exception.ProduitNotFoundException;
import com.example.TP_ExceptionSpringDATA.model.Produit;

import java.util.List;

public interface IProduitService {

    Produit create(Produit p);

    Produit findById(Long id) throws ProduitNotFoundException;

    List<Produit> findAll() throws ProduitNotFoundException;
}
