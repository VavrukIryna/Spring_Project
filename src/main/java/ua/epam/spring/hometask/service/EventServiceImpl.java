package ua.epam.spring.hometask.service;

import ua.epam.spring.hometask.DAO.EventDAOImpl;
import ua.epam.spring.hometask.domain.Event;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;

public class EventServiceImpl implements EventService {
    EventDAOImpl eventDAO = new EventDAOImpl();
    @Nullable
    @Override
    public Event getByName(@Nonnull String name) {
        System.out.println("Event service used getByName");
        return eventDAO.getByName(name);
    }

    @Override
    public Event save(@Nonnull Event object) {
        return eventDAO.save(object);
    }

    @Override
    public void remove(@Nonnull Event object) {
        eventDAO.remove(object);
    }

    @Override
    public Event getById(@Nonnull Integer id) {
        System.out.println("Event service used ");
        return eventDAO.getById(id);
    }

    @Nonnull
    @Override
    public Collection<Event> getAll() {
            return eventDAO.findAll();
    }

    //todo: add date from and date to
    public Event getForDateRange(){
        return null;
    }
    //todo: add date  to
    public Event getPurchasedTicketForEvent(){
        return null;
    }
}
