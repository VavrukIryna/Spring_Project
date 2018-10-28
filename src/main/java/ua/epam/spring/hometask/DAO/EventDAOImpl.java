package ua.epam.spring.hometask.DAO;

import ua.epam.spring.hometask.domain.Event;

import java.util.ArrayList;
import java.util.List;

public class EventDAOImpl implements DAO <Event> {
    List<Event> eventList = new ArrayList<>();

    @Override
    public Event save(Event entity) {
        eventList.add(entity);
        System.out.println("Event was saved to (List) by EventDao class");
        return entity;
    }

    @Override
    public void remove(Event entity) {
        eventList.remove(entity);
        System.out.println("Event was removed by EventDao class");
    }



    @Override
    public Event getById(Integer id) {
        return eventList.get(id);
    }

    public Event getByName(String name) {
        Event concreteEvent= null;
        int len =eventList.size();
        for(int i=0; i<len; i++) {
            if(eventList.get(i).getName().contains(name)){
                System.out.println("Event "+ eventList.get(i)+"find with name"+ name);
                concreteEvent = eventList.get(i);
            }

        }
        return concreteEvent;
    }

    @Override
    public List<Event> findAll() {
        return eventList;
    }
}
