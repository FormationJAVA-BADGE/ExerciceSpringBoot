package com.example.TP_Pourcentage.controller;

import com.example.TP_Pourcentage.service.IPourcentageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/percent")
public class PourcentageController {

    @Autowired
    IPourcentageService service;

    @GetMapping("/reduction/{remise}/{prixSansRemise}")
    public double calculateDiscount(@PathVariable("prixSansRemise") double price, @PathVariable("remise") double discountRate){
       return service.calculateDiscount(price, discountRate);
    }

    @GetMapping("/augmentation/{augmentation}/{prixBase}")
    public double calculateIncrease( @PathVariable("prixBase") double price,@PathVariable("augmentation") double increaseRate) {
        return service.calculateIncrease(price,increaseRate);
    }
}
