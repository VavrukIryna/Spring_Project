package ua.epam.spring.hometask.DAO;

import java.util.List;

public abstract interface DAO<T> {
    public T save (T entity);
    public void remove(T entity);
    public T getById(Integer id);
    public List<T> findAll();
}


