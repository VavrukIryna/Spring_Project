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
    public void update(Event entity) {
     /*   eventList.get(entity.getId()).getAuditoriums(entity.getAuditoriums());
        eventList.get(entity.getId()).setLastName(user.getLastName());
        eventList.get(entity.getId()).setEmail(user.getEmail());
        eventList.get(entity.getId()).setTickets(user.getTickets());
        System.out.println("User was updated by UserDao class");*/
    }

    @Override
    public Event getById(Integer id) {
        return null;
    }

    @Override
    public List<Event> findAll() {
        return null;
    }
}
