package br.com.jsn.sistemadistribuidonoa.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.jsn.sistemadistribuidonoa.service.ProduceService;

@Component
public class ProductResponseSuccessConsumer {

    @Autowired
    private ProduceService produceService ;

    @RabbitListener(queues = "${rabbitmq.queues.produto-response-success-queue}")
    public void receiver( String message){
       String result = String.valueOf(message);

       produceService.succesRequestProduct(result);
       System.out.println("MENSAGEM DE SUCESSO RECEBIDA " +result);
    }
    
}

