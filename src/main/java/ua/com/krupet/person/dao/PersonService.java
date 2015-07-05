package ua.com.krupet.person.dao;

import ua.com.krupet.person.Person;

import java.util.List;

/**
 * Created by krupet on 05.07.2015.
 */
public interface PersonService {
    void addPerson(Person p);
    List<Person> listPersons();
}
