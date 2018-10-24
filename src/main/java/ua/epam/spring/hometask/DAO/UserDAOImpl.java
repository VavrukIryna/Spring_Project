package ua.epam.spring.hometask.DAO;

import ua.epam.spring.hometask.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements DAO<User> {
    //sql insert into fields values
    //list is working as a database
    List<User> userList = new ArrayList<>();

    @Override
    public void save(User user) {

        userList.add(user);
        System.out.println("User was created by UserDao class");
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(User user) {
    userList.remove(user);
        System.out.println("User was removed by UserDao class");
    }

    @Override
    public User getById(Integer id) {

        return userList.get(id);
    }
//todo
    public User getByEmail(String email) {

      //  return userList.get()
        return null;
    }



    @Override
    public List<User> findAll() {
        return userList;
    }
}
