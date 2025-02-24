package com.example.TP1_SPRING_WEB.controller;

import com.example.TP1_SPRING_WEB.model.Produit;
import com.example.TP1_SPRING_WEB.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produit")
public class ProduitController {

     @Autowired
     private IProduitService service;

    @GetMapping("/find/{id}")
    public Produit findProduit(@PathVariable("id") int id){
        
       return service.findProduit(id);
    }

    @GetMapping("/findAll")
    public List<Produit> findAllProduit(){
        return service.findAllProduit();
    }


}
