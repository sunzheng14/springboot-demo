package com.sun.zq.service;

import com.sun.zq.model.Person;
import java.util.List;

public interface PersonService {
    void addPerson(Person person);

    Person getPerson(Long id);

    List<Person> list();
}
