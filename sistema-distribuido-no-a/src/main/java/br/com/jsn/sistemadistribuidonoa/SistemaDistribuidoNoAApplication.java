package br.com.jsn.sistemadistribuidonoa;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class SistemaDistribuidoNoAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDistribuidoNoAApplication.class, args);
	}

}
