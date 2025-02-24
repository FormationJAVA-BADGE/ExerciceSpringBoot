package com.example.TP_Pourcentage.service;

import org.springframework.stereotype.Service;

@Service
public class PourcentageServiceImpl implements IPourcentageService {
    @Override
    public double calculateDiscount(double price, double discountRate) {
        return price - (price * discountRate / 100);
    }

    @Override
    public double calculateIncrease(double price, double increaseRate) {
        return price + (price * increaseRate / 100);
    }}
