package br.com.jsn.sistema_distribuidonob.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderResponseErrorProducer {
   
    
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchanges.produto-response-erro-exchange}")
    private String produtoResponseErrorExchange;
    @Value("${rabbitmq.routing-keys.produto-response-erro-routing-key}")
    private String produtoResponseErrorRoutingKey;

    
    public void gerrarErroAoSolicitarProduto(String mensagem){

        rabbitTemplate.convertAndSend(produtoResponseErrorExchange,
        produtoResponseErrorRoutingKey,
        mensagem);
       
    }
}
