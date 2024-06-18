package br.com.jsn.sistema_distribuidonob.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class OrderResponseSuccessProducer {
   

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("${rabbitmq.exchanges.produto-response-success-exchange}")
    private String produtoResponseSuccessExchange ;
    @Value("${rabbitmq.routing-keys.produto-response-success-routing-key}")
    private String produtoResponseSuccessRountingKey;


    public void gerrarSucessoAoSolicitarProduto(String mensagem){

        rabbitTemplate.convertAndSend(produtoResponseSuccessExchange,
        produtoResponseSuccessExchange,
        mensagem);
        System.out.println("GERARA MENSAGEM DE SUCESSO PARA O PRODUTO " + mensagem);
        
       
    }
}