package com.sun.zq.model;

import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="book")
public class Book {
    private String author;

    private String name;

    private List<Address> addressList;

}
