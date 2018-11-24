package com.sun.zq.controller;

import com.sun.zq.redis.RedisUtil;
import com.sun.zq.model.Person;
import com.sun.zq.service.PersonService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PersonController {
    @Autowired RedisUtil redisUtil;

    @Autowired
    PersonService personService;

    @RequestMapping("/set")
    public void set(){
        Person person = new Person();
        person.setId(2L);
        person.setName("zhangsan");
        person.setAge(123);
        redisUtil.savePerson(person);
        redisUtil.stringRedisTemplateDemo();
    }
    @RequestMapping("/getStr")
    public String getStr(){
        return redisUtil.getString();
    }

    @RequestMapping("/getPerson")
    public Person getPerson(){
        return redisUtil.getPerson();
    }

    @RequestMapping("/addPerson")
    public void addPerson() {
        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(123);
        person.setEmail("134@qq.com");
        personService.addPerson(person);
    }

    @RequestMapping("/list")
    public List<Person> list() {
        log.debug("debug log = " + "hello");
        log.error("error log = " + "hello");
        log.info("info log = " + "hello");
        return personService.list();
    }

}
