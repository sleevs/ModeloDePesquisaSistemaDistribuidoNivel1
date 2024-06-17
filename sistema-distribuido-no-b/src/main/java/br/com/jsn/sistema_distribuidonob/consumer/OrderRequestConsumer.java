package br.com.jsn.sistema_distribuidonob.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.jsn.sistema_distribuidonob.producer.OrderResponseErrorProducer;
import br.com.jsn.sistema_distribuidonob.producer.OrderResponseSuccessProducer;

@Component
public class OrderRequestConsumer {

    @Autowired
    private OrderResponseSuccessProducer orderResponseSuccessProducer;
    @Autowired
    private OrderResponseErrorProducer orderResponseErrorProducer;

    @RabbitListener(queues = {"produto-request-queue"})
    public void receiver(@Payload Message message){
       String result = String.valueOf(message.getPayload());
        System.out.println("MENSAGEM RECEBIDA ---- " + result);

        if(message == null){
            orderResponseErrorProducer.gerrarErroAoSolicitarProduto("ERRO NO PRODUTO SOLICITADO" + result);
        }else{
            orderResponseSuccessProducer.gerrarSucessoAoSolicitarProduto(result);
        }
      
    }
    
}
