package br.com.pedidos.Growth.controller;

import br.com.pedidos.Growth.consumer.QueueConsumer;
import br.com.pedidos.Growth.producer.QueueProducer;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/messaging")
public class Controller {

  @Autowired
  private QueueConsumer consumer;

  @Autowired
  private QueueProducer producer;

  @GetMapping
  public ResponseEntity<String> consumer(){
    return ResponseEntity.ok("asd");
  }

  @GetMapping("/{message}")
  public ResponseEntity<String> producer(@PathParam("message") String message){
    producer.send(message);
    return ResponseEntity.ok("message send!");
  }
}
