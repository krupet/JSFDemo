package ua.com.krupet.person.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ua.com.krupet.person.Person;
import ua.com.krupet.person.PersonEntity;
import ua.com.krupet.person.dao.PersonDAO;

import java.util.ArrayList;
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
        PersonEntity entity = new PersonEntity(p.getName(), p.getCountry());
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> listPersons() {
        Session session = this.sessionFactory.getCurrentSession();
        List<PersonEntity> entityList = session.createQuery("from PersonEntity").list();

        List<Person> personList = new ArrayList<>();

        for (PersonEntity entity: entityList) {
            Person person = new Person(entity.getId(), entity.getName(), entity.getCountry());
            personList.add(person);
        }

        return personList;
    }
}
