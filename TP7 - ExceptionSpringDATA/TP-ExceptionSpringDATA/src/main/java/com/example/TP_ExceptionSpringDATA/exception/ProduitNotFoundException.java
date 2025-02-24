package com.example.TP_ExceptionSpringDATA.exception;

import jakarta.persistence.EntityNotFoundException;

public class ProduitNotFoundException extends Exception {
    public ProduitNotFoundException(String message) {

        super(message);
    }
}
