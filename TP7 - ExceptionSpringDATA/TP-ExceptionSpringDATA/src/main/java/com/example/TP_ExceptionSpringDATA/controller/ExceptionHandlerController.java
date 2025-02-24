package com.example.TP_ExceptionSpringDATA.controller;


import com.example.TP_ExceptionSpringDATA.exception.ProduitNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(ProduitNotFoundException.class)
    public ResponseEntity<String> handlerProduitNotFoundException(ProduitNotFoundException pe){
        return new ResponseEntity<>("Produit Not found "+pe.getMessage(),HttpStatus.NOT_FOUND);
    }
}
