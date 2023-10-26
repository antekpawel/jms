package com.kodilla.jms.own;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * User: Z6PWA
 * Date: 18.10.2023
 */
@RestController
public class OrderController
{
  private final JmsTemplate jmsTemplate;

  public OrderController(JmsTemplate jmsTemplate)
  {
    this.jmsTemplate = jmsTemplate;
  }

  @GetMapping(path = "/order")
  public void processMessage(@RequestBody Order order)
  {
    jmsTemplate.convertAndSend("order-queue", order);
  }
}
