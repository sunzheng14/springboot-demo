package com.sun.zq.controller;

import com.google.common.collect.Maps;
import com.sun.zq.model.Book;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestCotroller {
    @Value("${book.author}")
    private String author;
    @Value("${book.name}")
    private String name;

    @Autowired
    private Book book;

    @RequestMapping("/index")
    public String test() {
        return "hello spring boot";
    }

    @RequestMapping("/book")
    public Map<String, Object> book(){
        Map<String, Object> map = Maps.newHashMap();
        map.put("author", author);
        map.put("name", name);
        return map;
    }

    @RequestMapping("/getBook")
    public Book getBook() {
        return book;
    }
}
