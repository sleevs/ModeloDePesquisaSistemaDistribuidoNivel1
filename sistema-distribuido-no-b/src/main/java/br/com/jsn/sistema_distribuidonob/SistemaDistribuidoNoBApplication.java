package br.com.jsn.sistema_distribuidonob;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableRabbit
@SpringBootApplication
public class SistemaDistribuidoNoBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDistribuidoNoBApplication.class, args);
	}

}
