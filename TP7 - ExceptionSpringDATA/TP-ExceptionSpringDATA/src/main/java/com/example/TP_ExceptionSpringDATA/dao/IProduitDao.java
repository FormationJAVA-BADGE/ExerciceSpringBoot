package com.example.TP_ExceptionSpringDATA.dao;

import com.example.TP_ExceptionSpringDATA.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Repository
public interface IProduitDao extends JpaRepository<Produit, Long> { }


