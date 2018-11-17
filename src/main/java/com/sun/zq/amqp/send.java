package com.sun.zq.amqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class send implements CommandLineRunner{
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("生产消息");
        rabbitTemplate.convertAndSend("my-queue", "来自 RabbitMQ的问候");
    }
}
