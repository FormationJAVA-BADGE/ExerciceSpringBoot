package com.example.TP_EVENT.model;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private int month;
    private List<String> eventsTitle;

    public Event(int month) {
        this.month = month;
        this.eventsTitle=new ArrayList<>();

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public List<String> getEventsTitle() {
        return eventsTitle;
    }

    public void setEventsTitle(List<String> eventsTitle) {
        this.eventsTitle = eventsTitle;
    }
}
