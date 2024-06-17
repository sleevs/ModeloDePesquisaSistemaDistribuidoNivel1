package br.com.jsn.sistema_distribuidonob.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class MQConfig {

    @Value("${rabbitmq.queues.produto-request-queue}")
    private String QUEUE_REQUEST ;
    @Value("${rabbitmq.exchanges.produto-response-erro-exchange}")
    private String EXCHANGE_ERROR ;
    @Value("${rabbitmq.exchanges.produto-response-success-exchange}")
    private String EXCHANGE_SUCCESS ;
    @Value("${rabbitmq.routing-keys.produto-response-erro-routing-key}")
    private String ROUTE_KEY_ERROR ;
    @Value("${rabbitmq.routing-keys.produto-response-success-routing-key}")
    private String ROUTE_KEY_SUCCESS ;
    
    @Bean
    @Primary
    public Queue queueRequest(){
      return new Queue(QUEUE_REQUEST,false);  
    }

    @Bean
    public Queue queueRequest2(){
      return new Queue(QUEUE_REQUEST,false);  
    }
   
    
    @Bean
    public TopicExchange exchangeError(){
        return new TopicExchange(EXCHANGE_ERROR);
    }

    @Bean
    @Primary
    public TopicExchange exchangeSuccess(){
        return new TopicExchange(EXCHANGE_SUCCESS);
    }

    @Bean 
    public Binding bindingError(Exchange exchange){
        return BindingBuilder.bind(queueRequest2()).to(exchangeError()).with(ROUTE_KEY_ERROR);
    }

    
    @Bean
    @Primary
    public Binding bindingSuccess(Exchange exchange){
        return BindingBuilder.bind(queueRequest()).to(exchangeSuccess()).with(ROUTE_KEY_SUCCESS);
    }

   
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setReplyTimeout(60000); // 60 segundos
        return rabbitTemplate;
    }
   
}

