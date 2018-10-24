package ua.epam.spring.hometask.service;

import ua.epam.spring.hometask.DAO.AuditoriumDAOImpl;
import ua.epam.spring.hometask.domain.Auditorium;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AuditoriumServiceImpl implements AuditoriumService {
    @Nonnull
    @Override
    public List<Auditorium> getAll() {
      AuditoriumDAOImpl auditoriumDAO = new AuditoriumDAOImpl();
        System.out.println("CREATE NEW AUDITORIUM");
        Auditorium auditorium = new Auditorium();
        auditorium.setName("create By service");
        auditorium.setNumberOfSeats(10);
        auditorium.setVipSeats(Stream.of(1L,2L,3L).collect(Collectors.toSet()));

        Auditorium insertedAuditorium = auditoriumDAO.create(auditorium);
        System.out.println("______________________________");
        System.out.println("read all data from Auditorium");
        System.out.println("______________________________");
        List<Auditorium> auditoriumList = auditoriumDAO.findAll();
        for (Auditorium item:auditoriumList){
            System.out.println("All auditorium"+ item);
        }
      return auditoriumList;
    }

    @Nullable
    @Override
    public Auditorium getByName(@Nonnull String name) {
        return null;
    }


}
