package ua.epam.spring.hometask.DAO;

import java.util.List;

public abstract interface DAO<T> {
    public T create(T entity);
    public void update (T entity);
    public void delete (T entity);
    public T findById(Integer id);
    public List<T> findAll();
}
