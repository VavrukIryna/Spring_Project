package ua.epam.spring.hometask.service;

import ua.epam.spring.hometask.DAO.UserDAOImpl;
import ua.epam.spring.hometask.domain.User;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;

public class UserServiceImpl implements UserService {
    UserDAOImpl userDAO = new UserDAOImpl();


    @Nullable
    @Override
    public User getUserByEmail(@Nonnull String email) {
        System.out.println("User service used getUserByEmail");
        return userDAO.getByEmail(email);
    }

    @Override
    public User save(@Nonnull User object) {
        return userDAO.save(object);
    }

    @Override
    public void remove(@Nonnull User object) {
         userDAO.remove(object);

    }

    @Override
    public User getById(@Nonnull Integer id) {
        System.out.println("User service used getUserByEmail");
        return userDAO.getById(id);
    }

       @Nonnull
    @Override
    public Collection<User> getAll() {
        return userDAO.findAll();
    }
}
