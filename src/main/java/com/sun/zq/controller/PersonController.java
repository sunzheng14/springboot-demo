package com.sun.zq.controller;

import com.sun.zq.dao.PersonDao;
import com.sun.zq.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonDao personDao;

    @RequestMapping("/set")
    public void set(){
        Person person = new Person();
        person.setId("2");
        person.setName("zhangsan");
        person.setAge(123);
        personDao.savePerson(person);
        personDao.stringRedisTemplateDemo();
    }
    @RequestMapping("/getStr")
    public String getStr(){
        return personDao.getString();
    }

    @RequestMapping("/getPerson")
    public Person getPerson(){
        return personDao.getPerson();
    }

}
