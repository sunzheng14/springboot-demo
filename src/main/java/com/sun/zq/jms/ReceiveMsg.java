package com.sun.zq.jms;

//import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMsg {

    //@JmsListener(destination = "test")
    public void receiveMessage(String message){
        System.out.println("接收到:<" + message + ">");
    }
}
