package ua.epam.spring.hometask.DAO;

import ua.epam.spring.hometask.domain.Auditorium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditoriumDAOImpl  {

    List<Auditorium> auditoriumList = new ArrayList<>();
 /*  Map m = new HashMap<>();
        m.put("name",auditorium.getName());
        m.put("numberOfseats", auditorium.getNumberOfSeats());
        m.put("vipSeats", auditorium.getVipSeats());
        */

    public Auditorium save(Auditorium auditorium) {
        auditoriumList.add(auditorium);
        System.out.println("Auditorium was saved to (List) by AuditoriumDao class");
      return auditorium;
    }


    public Auditorium getByName(String name) {
        Auditorium concreteAuditorium = null;
        int len = auditoriumList.size();
        for(int i=0; i<len; i++) {
            if(auditoriumList.get(i).getName().contains(name)){
                System.out.println("Auditorium "+ auditoriumList.get(i)+"find with name"+ name);
                concreteAuditorium =  auditoriumList.get(i);
            }
        }
        return concreteAuditorium;
    }


    public List<Auditorium> findAll() {
        return auditoriumList;




    }
}
