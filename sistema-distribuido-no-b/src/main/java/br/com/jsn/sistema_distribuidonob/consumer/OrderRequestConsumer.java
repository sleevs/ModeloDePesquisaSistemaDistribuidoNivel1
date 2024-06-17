package br.com.jsn.sistema_distribuidonob.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.jsn.sistema_distribuidonob.producer.OrderResponseErrorProducer;
import br.com.jsn.sistema_distribuidonob.producer.OrderResponseSuccessProducer;
import jakarta.annotation.PostConstruct;

@Component
public class OrderRequestConsumer {

    @Autowired
    private OrderResponseSuccessProducer orderResponseSuccessProducer;
    @Autowired
    private OrderResponseErrorProducer orderResponseErrorProducer;



    @RabbitListener(queues = "${rabbitmq.queues.produto-request-queue}")
    public void receiver(String message){
       String result = String.valueOf(message);
        System.out.println("MENSAGEM RECEBIDA ---- " + result);

        if(message == null){
            orderResponseErrorProducer.gerrarErroAoSolicitarProduto("ERRO NO PROCESSAMENTO DO PRODUTO SOLICITADO : " + result);
        }else{
            orderResponseSuccessProducer.gerrarSucessoAoSolicitarProduto("SUCESSO NO PROCESSAMENTO DO PRODUTO SOLICITADO : " + result);
        }
      
    }
    
}
