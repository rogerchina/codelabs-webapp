package org.myapp.dao.impl;

import org.myapp.dao.GenericDao;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service  
@Transactional  
public class GenericDaoImpl extends HibernateDaoSupport implements GenericDao {  
  
    public <T> void save(T t) {  
        getHibernateTemplate().save(t);  
    }  
  
    public <T> void delete(T t) {  
        getHibernateTemplate().delete(t);  
    }  
  
    public <T> void update(T t) {  
        getHibernateTemplate().update(t);  
    }  
  
    public <T> T findById(Class<T> clazz, int id) {  
        return (T) getHibernateTemplate().get(clazz, id);  
    }  
  
}  