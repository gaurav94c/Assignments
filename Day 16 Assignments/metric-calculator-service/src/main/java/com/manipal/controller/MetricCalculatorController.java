package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.MetricCalculatorBean;
import com.manipal.proxy.MetricConversionProxy;

@RestController
public class MetricCalculatorController {

	@Autowired
	private MetricConversionProxy proxy;
	/*@GetMapping("metric-calculator/from/{from}/to/{to}/unit/{unit}")
	public MetricCalculatorBean calculateUnit(@PathVariable String from, @PathVariable String to, @PathVariable int unit) {
		return new MetricCalculatorBean(1L, from, to, 0, unit, 0 );
	}*/
	
	@GetMapping("metric-calculator/from/{from}/to/{to}/unit/{unit}")
	public MetricCalculatorBean calculateUnit(@PathVariable String from, @PathVariable String to, @PathVariable int unit) {
		MetricCalculatorBean bean = proxy.retrieveCalculatedValue(from, to);
		System.out.println("-------------------->"+bean.getTotalUnits());
		double totalUnits = bean.getConversionMultiple()* unit;		
		return new MetricCalculatorBean(1L, from, to, bean.getConversionMultiple(), unit, totalUnits, bean.getPort() );
	}
	
	
	
}
