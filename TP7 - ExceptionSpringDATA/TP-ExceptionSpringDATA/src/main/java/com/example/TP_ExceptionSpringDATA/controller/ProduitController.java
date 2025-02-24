package com.example.TP_ExceptionSpringDATA.controller;


import com.example.TP_ExceptionSpringDATA.Service.IProduitService;
import com.example.TP_ExceptionSpringDATA.exception.ProduitNotFoundException;
import com.example.TP_ExceptionSpringDATA.model.Produit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/produit")
public class ProduitController {

    IProduitService service;

    public ProduitController(IProduitService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<Produit> createProduit(@RequestBody Produit p){
        Produit produit=service.create(p);

        return new ResponseEntity<>(produit, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Produit> findById(@PathVariable("id") Long id) throws ProduitNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
}
