package com.manipal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}

}
//Via Zuul: http://localhost:8765/{microservice-app name}/{uri}

//without Zuul:http://localhost:9000/metric-calculator/from/KM/to/METER/unit/40

//Via Zuul: http://localhost:8765/metric-calculator-service/metric-calculator/from/KM/to/METER/unit/40