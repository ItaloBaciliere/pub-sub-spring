package br.com.pedidos.Growth.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {

  @Value("${queue.name}")
  private String message;

  @Bean
  public Queue message(){
    return new Queue(message, true);
  }
}
