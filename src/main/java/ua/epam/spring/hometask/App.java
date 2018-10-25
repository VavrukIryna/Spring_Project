package ua.epam.spring.hometask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.epam.spring.hometask.domain.Auditorium;
import ua.epam.spring.hometask.domain.User;
import ua.epam.spring.hometask.service.AuditoriumServiceImpl;
import ua.epam.spring.hometask.service.UserService;
import ua.epam.spring.hometask.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    User user;
    List<User> userList = new ArrayList<>();
    public App(){}

    public App (User user){
        this.user = user;
    }

    public static void main(String[] args){
     /*   System.out.println("Save New Auditorium");
        Auditorium auditorium = new Auditorium();
        auditorium.setName("firstname");
        auditorium.setNumberOfSeats(12);
        auditorium.setVipSeats(Stream.of(1L,2L,3L).collect(Collectors.toSet()));
        AuditoriumServiceImpl auditoriumService = new AuditoriumServiceImpl();
        auditoriumService.getAll();
   */


        System.out.println("App used");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App)ctx.getBean("app");


        /*User user = new User();
        user.setEmail("myemail@email.com");
        user.setFirstName("FirstName");
        user.setLastName("last Name");

        */
        System.out.println("users email");
        System.out.println(app.user.getEmail());
        UserServiceImpl userService = new UserServiceImpl();
        userService.save(app.user);
        System.out.println("get user by id");
        System.out.println(userService.getById(0));
        System.out.println("get user by email");
        System.out.println(userService.getUserByEmail("Bean email"));
    }
}
