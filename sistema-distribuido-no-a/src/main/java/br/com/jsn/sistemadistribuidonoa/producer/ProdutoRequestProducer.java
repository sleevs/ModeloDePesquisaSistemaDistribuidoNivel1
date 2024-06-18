package br.com.jsn.sistemadistribuidonoa.producer;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.jsn.sistemadistribuidonoa.dto.ProductDto;

@Service
public class ProdutoRequestProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("${rabbitmq.exchanges.produto-request-exchange}")
    private String productRequestExchange;
    @Value("${rabbitmq.routing-keys.produto-request-routing-key}")
    private String productRequestRouteKey;


    public void solicitarProduto(List<ProductDto> lista){

        rabbitTemplate.convertAndSend(productRequestExchange,
        productRequestRouteKey,
        lista.toString());
        System.out.println("MENSAGEM ENVIADA " +lista);
       
    }


    
}
