package com.example.TP_EVENT.dao;

import com.example.TP_EVENT.model.Event;

import java.util.List;

public interface IEventDao {

    List<Event> findAllEvents();
}
