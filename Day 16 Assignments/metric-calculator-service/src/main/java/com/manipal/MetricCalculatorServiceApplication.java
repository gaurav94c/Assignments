package com.manipal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.manipal")
@EnableDiscoveryClient
public class MetricCalculatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetricCalculatorServiceApplication.class, args);
	}

}
