package com.example.TP_EVENT.service;

import com.example.TP_EVENT.dao.IEventDao;
import com.example.TP_EVENT.model.Event;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements IEventService {

    private IEventDao dao;

    public EventServiceImpl(IEventDao dao) {

        this.dao = dao;
    }

    @Override
    public List<Event> findAllEvents() {


        return dao.findAllEvents()
                .stream()
                .filter((event) ->  event.getMonth()==LocalDate.now().getMonthValue())
                .collect(Collectors.toList());
    }

    @Override
    public List<Event> findEventByMonth(int monthNumber) {
        if(monthNumber>12){
            //exception
        }
          return dao.findAllEvents()
                .stream()
                .filter((event) ->  event.getMonth()==monthNumber)
                .collect(Collectors.toList());
    }
}
