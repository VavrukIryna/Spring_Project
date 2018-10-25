package ua.epam.spring.hometask.DAO;

import ua.epam.spring.hometask.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements DAO<User> {

    //list is working as a database at this case
    List<User> userList = new ArrayList<>();

    @Override
    public User save(User user) {

        userList.add(user);
        System.out.println("User was saved to (List) by UserDao class");
        return user;
    }

    @Override
    public void update(User user) {
        userList.get(user.getId()).setFirstName(user.getFirstName());
        userList.get(user.getId()).setLastName(user.getLastName());
        userList.get(user.getId()).setEmail(user.getEmail());
        userList.get(user.getId()).setTickets(user.getTickets());
        System.out.println("User was updated by UserDao class");
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

    public User getByEmail(String email) {
        int len=userList.size();
        for(int i=0; i<len; i++) {
               if(userList.get(i).getEmail().contains(email)){
                   System.out.println("User"+ userList.get(i)+"find with email"+ email);
                   return userList.get(i);
               }
        }
        return null;
    }



    @Override
    public List<User> findAll() {
        return userList;
    }
}
