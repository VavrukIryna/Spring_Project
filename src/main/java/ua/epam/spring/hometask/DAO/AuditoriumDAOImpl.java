package ua.epam.spring.hometask.DAO;

import ua.epam.spring.hometask.domain.Auditorium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditoriumDAOImpl implements DAO<Auditorium> {
    @Override
    public Auditorium save(Auditorium auditorium) {
        Map m = new HashMap<>();
        m.put("name",auditorium.getName());
        m.put("numberOfseats", auditorium.getNumberOfSeats());
        m.put("vipSeats", auditorium.getVipSeats());
        return auditorium;
    }

    @Override
    public void update(Auditorium auditorium) {

    }

    @Override
    public void remove(Auditorium auditorium) {

    }

    @Override
    public Auditorium getById(Integer id) {
        return null;
    }

    @Override
    public List<Auditorium> findAll() {
        List<Auditorium> auditoriumList = new ArrayList<>();
return null;




    }
}
