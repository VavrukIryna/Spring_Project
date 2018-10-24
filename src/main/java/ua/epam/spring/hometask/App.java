package ua.epam.spring.hometask;

import ua.epam.spring.hometask.domain.Auditorium;
import ua.epam.spring.hometask.service.AuditoriumServiceImpl;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args){
        System.out.println("Save New Auditorium");
        Auditorium auditorium = new Auditorium();
        auditorium.setName("firstname");
        auditorium.setNumberOfSeats(12);
        auditorium.setVipSeats(Stream.of(1L,2L,3L).collect(Collectors.toSet()));
        AuditoriumServiceImpl auditoriumService = new AuditoriumServiceImpl();
        auditoriumService.getAll();
    }
}
