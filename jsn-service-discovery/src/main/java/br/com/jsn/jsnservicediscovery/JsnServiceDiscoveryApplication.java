package br.com.jsn.jsnservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class JsnServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsnServiceDiscoveryApplication.class, args);
	}

}
