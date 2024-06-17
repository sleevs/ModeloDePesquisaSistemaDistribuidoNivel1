package br.com.jsn.sistemadistribuidonoa.consumer;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.jsn.sistemadistribuidonoa.configuration.MQConfig;
import br.com.jsn.sistemadistribuidonoa.service.ProduceService;

@Component
public class ProductResponseErrorConsumer {

    @Autowired
    private ProduceService produceService ;

    @RabbitListener(queues = "${rabbitmq.queues.produto-response-erro-queue}")
    public void receiver(String message){
       String result = String.valueOf(message);

       produceService.erroRequestProduct(result);
       System.out.println("MENSAGEM DE ERRO RECEBIDA " +result);
    }
    
}
