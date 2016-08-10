package org.myapp.dao;

public interface GenericDao {
    public <T> void save(T t);  
    public <T> void delete(T t);  
    public <T> void update(T t);  
    public <T> T findById(Class<T> clazz, int id);  
}
