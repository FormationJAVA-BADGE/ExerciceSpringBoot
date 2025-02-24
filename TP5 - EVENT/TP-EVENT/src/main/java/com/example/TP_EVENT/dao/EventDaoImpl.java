package com.example.TP_EVENT.dao;

import com.example.TP_EVENT.model.Event;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EventDaoImpl implements IEventDao {

    @Override
    public List<Event> findAllEvents() {

        List<Event> events=new ArrayList<>();

        for(int i=1;i<13;i++){
            Event e=new Event(i);
            List<String> titreEvent= new ArrayList<>();
            titreEvent.add("anniversaire "+i);
            titreEvent.add("Fête "+i);
            e.setEventsTitle(titreEvent);
            events.add(e);
        }
        return events;
    }
}
