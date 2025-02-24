package com.example.TP_ExceptionSpringDATA.Service;

import com.example.TP_ExceptionSpringDATA.dao.IProduitDao;
import com.example.TP_ExceptionSpringDATA.exception.ProduitNotFoundException;
import com.example.TP_ExceptionSpringDATA.model.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements IProduitService {

    IProduitDao dao;

    public ProduitServiceImpl(IProduitDao dao) {
        this.dao = dao;
    }

    @Override
    public Produit create(Produit p) {
      return   dao.save(p);
    }

    @Override
    public Produit findById(Long id) throws ProduitNotFoundException {


        return dao.findById(id)
                .orElseThrow(()->new ProduitNotFoundException("le produit "+id+ " n'existe pas"));
    }

    @Override
    public List<Produit> findAll() throws ProduitNotFoundException {
        return dao.findAll();
    }
}
