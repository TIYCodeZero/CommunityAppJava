package com.example;

import java.util.List;

/**
 * Created by DTG2 on 10/11/16.
 */
public class EventContainer {
    List<Event> eventList;
    String errorMessage;

    public Event getResponseEvent() {
        return responseEvent;
    }

    public void setResponseEvent(Event responseEvent) {
        this.responseEvent = responseEvent;
    }

    Event responseEvent;


    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public EventContainer() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
