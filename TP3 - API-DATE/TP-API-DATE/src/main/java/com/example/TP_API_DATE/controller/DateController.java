package com.example.TP_API_DATE.controller;


import com.example.TP_API_DATE.service.IDateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/date")
public class DateController {

    private IDateService service;

    public DateController(IDateService service) {
        this.service = service;
    }

    @GetMapping("/week")
    public int getWeekOfYear(){
        return service.getWeekOfYear();
    }

    @GetMapping("/month")
    public int getMonth(){
        return service.getMonth();
    }

    @GetMapping("/day")
    public int getDay(){
        return service.getDay();
    }

    @GetMapping("/year")
    public int getyear(){
        return service.getYear();
    }

    @GetMapping("/leap")
    public boolean isLeap(){
        return service.isLeap();
    }


}
