package br.com.jsn.sistemadistribuidonoa.configuration;



import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MQConfig {

    @Value("${rabbitmq.queues.produto-response-erro-queue}")
    private String QUEUE_RESPONSE_ERROR ;
    @Value("${rabbitmq.queues.produto-response-success-queue}")
    private String QUEUE_RESPONSE_SUCCESS ;
    @Value("${rabbitmq.exchanges.produto-request-exchange}")
    private String EXCHANGE ;
    @Value("${rabbitmq.routing-keys.produto-request-routing-key}")
    private String ROUTE_KEY ;

    /*
    QUEUE
    produto-request-queue
    produto-response-erro-queue
    produto-response-success-queue
    EXCHANGE	
    produto-request-exchange	
    produto-response-erro-exchange	
    produto-response-success-exchange
    BIND
    produto-request-queue - ROUTE-KEY : produto-request-routing-key
    produto-response-erro-queue - ROUTE-KEY : produto-response-erro-routing-key
    produto-response-success-queue - ROUTE-KEY :produto-response-success-routing-key
     */
    
  
    
    @Bean
    @Primary
    public Queue queueResponseError(){
      return new Queue(QUEUE_RESPONSE_ERROR,false);  
    }
   
    @Bean
    public Queue queueResponseSuccess(){
      return new Queue(QUEUE_RESPONSE_SUCCESS,false);  
    }
    
    
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(EXCHANGE);
    }

    @Bean 
    public Binding binding(Queue queue ,Exchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(ROUTE_KEY).noargs();
    }

   
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setReplyTimeout(60000); // 60 segundos
        return rabbitTemplate;
    }
   
}
