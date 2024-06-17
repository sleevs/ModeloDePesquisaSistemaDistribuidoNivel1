package br.com.jsn.sistema_distribuidonob.producer;



import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderResponseErrorProducer {
   
    
     @Autowired
    private AmqpTemplate amqpTemplate;


    public void gerrarErroAoSolicitarProduto(String mensagem){

        amqpTemplate.convertAndSend("produto-response-erro-exchange",
        "produto-response-erro-routing-key",
        mensagem);
       
    }
}
