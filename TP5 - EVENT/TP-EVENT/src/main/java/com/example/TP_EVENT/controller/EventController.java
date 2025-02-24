package com.example.TP_EVENT.controller;

import com.example.TP_EVENT.model.Event;
import com.example.TP_EVENT.service.IEventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/event")
public class EventController {

    private IEventService service;

    public EventController(IEventService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Event> findAllEvents(){
       return service.findAllEvents();
    }

    @GetMapping("/{month}")
    public List<Event> findEventByMonth(@PathVariable("month") int monthNumber){
        return service.findEventByMonth(monthNumber);
    }
}
