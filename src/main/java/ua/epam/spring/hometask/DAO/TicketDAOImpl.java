package ua.epam.spring.hometask.DAO;

import ua.epam.spring.hometask.domain.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketDAOImpl implements  DAO<Ticket>{
    List<Ticket> ticketList = new ArrayList<>();
    @Override
    public Ticket save(Ticket ticket) {
        ticketList.add(ticket);
        System.out.println("Ticket was saved to (List) by TicketDao class");
        return ticket;
    }

   @Override
    public void remove(Ticket ticket) {
       ticketList.remove(ticket);
       System.out.println("Ticket was removed by TicketDao class");
   }


    @Override
    public Ticket getById(Integer id) {
        return ticketList.get(id);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketList;
    }
}
