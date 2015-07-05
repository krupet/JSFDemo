package ua.com.krupet.person.dao.impl;

import org.springframework.transaction.annotation.Transactional;
import ua.com.krupet.person.Person;
import ua.com.krupet.person.dao.PersonDAO;
import ua.com.krupet.person.dao.PersonService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * Created by krupet on 05.07.2015.
 */

@ManagedBean(name="personService")
@SessionScoped
public class PersonServiceImpl implements PersonService {

    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    @Transactional
    public void addPerson(Person p) {
        this.personDAO.addPerson(p);
    }

    @Override
    @Transactional
    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }
}
