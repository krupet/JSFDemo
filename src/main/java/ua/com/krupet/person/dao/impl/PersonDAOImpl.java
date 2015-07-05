package ua.com.krupet.person.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ua.com.krupet.person.Person;
import ua.com.krupet.person.dao.PersonDAO;

import java.util.List;

/**
 * Created by krupet on 05.07.2015.
 */

public class PersonDAOImpl implements PersonDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void addPerson(Person p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> listPersons() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from Person").list();
    }
}
