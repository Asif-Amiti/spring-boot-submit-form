package com.submitform.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.submitform.app.dao.UserDao;
import com.submitform.app.dto.Persons;

@Repository
class UserDaoImpl extends HibernateDaoSupport implements UserDao{
	
	@PersistenceContext
    EntityManager entityManager;
	
	private static final Logger log = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@SuppressWarnings("unused")
	@Autowired
	private void setUserServicesSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public Session getCurrentSession() {
		return getSessionFactory().getCurrentSession();
	}
	    
	String USER_QUERY="select FirstName, LastName, Address, Citi from Persons where PersonID=:personId";
	@Override
	public <T> T findById(Class<T> clazz, Long id) {
		// TODO Auto-generated method stub
		if(id == null) return null;
        return getHibernateTemplate().get(clazz, id);
	}
	
	
	public List<Persons> findPersonById(int id) {
		long stTime = System.currentTimeMillis();
        try{
            
                TypedQuery<Persons> query = entityManager.createQuery(USER_QUERY, Persons.class)
                        .setParameter("personId", id);
                
                return query.getResultList();
        }catch (Exception e) {
            log.error("Error while fetching", e);
            throw e;
        } finally {
            log.info("Fetched persons");
        }
	}
	
	//OR
	
	
	public Persons findPerson(int personId) {
		return entityManager.find(Persons.class, Long.valueOf(personId));
	}
	
}
