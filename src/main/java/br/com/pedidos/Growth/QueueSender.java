package br.com.pedidos.Growth;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {

  @Autowired
  private Queue queue;

  @Autowired
  private RabbitTemplate rabbitTemplate;

  public void send(String order){
    rabbitTemplate.convertAndSend(this.queue.getName(), order);
  }
}
