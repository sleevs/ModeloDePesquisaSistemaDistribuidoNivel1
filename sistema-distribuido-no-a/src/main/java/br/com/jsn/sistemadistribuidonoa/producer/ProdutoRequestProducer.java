package br.com.jsn.sistemadistribuidonoa.producer;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jsn.sistemadistribuidonoa.dto.ProductDto;

@Component
public class ProdutoRequestProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void solicitarProduto(List<ProductDto> lista){

        amqpTemplate.convertAndSend("produto-request-exchange",
        "produto-request-routing-key",
        lista.toString());
       
    }


    
}
