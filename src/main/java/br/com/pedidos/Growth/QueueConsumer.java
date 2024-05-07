package br.com.pedidos.Growth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class QueueConsumer {

  @RabbitListener(queues = "order")
  public void receive(@Payload String fileBody){
    log.info("Mensagem: {}", fileBody);
  }
}
