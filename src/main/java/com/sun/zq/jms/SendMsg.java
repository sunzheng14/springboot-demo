package com.sun.zq.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendMsg implements CommandLineRunner{
//    @Autowired
//    JmsTemplate jmsTemplate;
    @Override
    public void run(String... args) throws Exception {
        //jmsTemplate.send("test", new Msg());
    }
}
