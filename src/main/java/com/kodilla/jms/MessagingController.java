package com.kodilla.jms;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * User: Z6PWA
 * Date: 18.10.2023
 */
@RestController
@RequestMapping("/messages")
public class MessagingController
{
  private final JmsTemplate jmsTemplate;

  public MessagingController(JmsTemplate jmsTemplate)
  {
    this.jmsTemplate = jmsTemplate;
  }

  @GetMapping(path = "/process")
  public void processMessage(@RequestParam String message)
  {
//    System.out.println("Message: " + message);
    jmsTemplate.convertAndSend("queue-test", message);
  }
}
