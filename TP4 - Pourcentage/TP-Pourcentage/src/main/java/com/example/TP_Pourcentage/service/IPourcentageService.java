package com.example.TP_Pourcentage.service;

public interface IPourcentageService {

    double calculateDiscount(double price, double discountRate);
    double calculateIncrease(double price, double increaseRate);
}
