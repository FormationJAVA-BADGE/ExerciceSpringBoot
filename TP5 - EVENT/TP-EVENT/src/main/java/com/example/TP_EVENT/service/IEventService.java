package com.example.TP_EVENT.service;

import com.example.TP_EVENT.model.Event;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEventService {

    List<Event> findAllEvents();

    List<Event> findEventByMonth( int monthNumber);
}
