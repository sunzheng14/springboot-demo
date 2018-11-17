package com.sun.zq.service;

import com.sun.zq.dao.PersonMapper;
import com.sun.zq.dao.PersonRepository;
import com.sun.zq.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonMapper personMapper;

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person getPerson(Long id) {
        return personMapper.getOne(id);
    }

    @Override
    public List<Person> list() {
       return personMapper.getAll();
    }


}
