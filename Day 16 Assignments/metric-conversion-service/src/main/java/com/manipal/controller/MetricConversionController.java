package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.ConversionRate;

@RestController
public class MetricConversionController {
	
	@Autowired
	private Environment environment;

	@GetMapping("metric-conversion/from/{from}/to/{to}")
	public ConversionRate getConversionRate(@PathVariable String from, @PathVariable String to) {
		
		int port = Integer.parseInt(environment.getProperty("local.server.port"));
		return new ConversionRate(1L, from, to, port);
		
	}
}
