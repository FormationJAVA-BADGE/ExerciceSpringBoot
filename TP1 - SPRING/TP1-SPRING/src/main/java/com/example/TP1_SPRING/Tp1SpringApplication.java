package com.example.TP1_SPRING;

import com.example.TP1_SPRING.model.Produit;
import com.example.TP1_SPRING.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1SpringApplication {

	@Autowired
	static IProduitService service;

	public static void main(String[] args) {
       service.createProduit(new Produit("velo"));
       SpringApplication.run(Tp1SpringApplication.class, args);
	}

}
