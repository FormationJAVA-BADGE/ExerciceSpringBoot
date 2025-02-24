package com.example.TP1_SPRING_WEB.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

@RestController
@RequestMapping("/api/v1")
public class HelloController {


    @GetMapping("/hello")
    public String sayHello(){

        return "Hello !!";
    }

    @GetMapping("/hi")
    public int sayHi(){

        return LocalDate.now().get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
    }
}

