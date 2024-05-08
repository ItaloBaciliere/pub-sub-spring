package br.com.pedidos.Growth.producer;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueProducer {

  @Autowired
  private Queue queue;

  @Autowired
  private RabbitTemplate rabbitTemplate;

  public void send(String order){
    rabbitTemplate.convertAndSend("exOrder", "outing-key-teste", order);
  }
}
