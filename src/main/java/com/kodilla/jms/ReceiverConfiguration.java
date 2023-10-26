package com.kodilla.jms;

import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

/**
 * User: Z6PWA
 * Date: 18.10.2023
 */
@Configuration
@EnableJms
public class ReceiverConfiguration
{
  @Bean
  public JmsListenerContainerFactory<?> jmsFactory(
    ConnectionFactory connection, DefaultJmsListenerContainerFactoryConfigurer configurer) {
    DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
    configurer.configure(factory, connection);
    return factory;
  }
}
