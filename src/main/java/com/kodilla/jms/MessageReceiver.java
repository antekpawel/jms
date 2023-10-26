package com.kodilla.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * User: Z6PWA
 * Date: 18.10.2023
 */
@Component
public class MessageReceiver {

  @JmsListener(containerFactory = "jmsFactory", destination = "queue-test")
  public void receive(String message) {
    System.out.println("Received the message: " + message);
  }

}
