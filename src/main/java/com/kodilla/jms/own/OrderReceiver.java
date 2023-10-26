package com.kodilla.jms.own;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * User: Z6PWA
 * Date: 18.10.2023
 */
@Component
public class OrderReceiver
{

  @JmsListener(containerFactory = "jmsFactory", destination = "order-queue")
  public void receive(Order order) {
    System.out.println("Received the message: " + order);
  }

}
