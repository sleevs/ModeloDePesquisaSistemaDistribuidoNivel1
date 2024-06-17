package br.com.jsn.sistema_distribuidonob.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderResponseSuccessProducer {
   

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void gerrarSucessoAoSolicitarProduto(String mensagem){

        amqpTemplate.convertAndSend("produto-response-success-exchange",
        "produto-response-success-routing-key",
        mensagem);
       
    }
}