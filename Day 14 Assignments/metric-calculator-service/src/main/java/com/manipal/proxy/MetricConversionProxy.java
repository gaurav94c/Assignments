package com.manipal.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.model.MetricCalculatorBean;

//@FeignClient(name = "metric-conversion-service", url = "localhost:8001")
//@FeignClient(name = "metric-conversion-service")
@FeignClient(name = "zuul-api-gateway")
@RibbonClient(name = "metric-conversion-service")
public interface MetricConversionProxy {
	//@GetMapping("metric-conversion/from/{from}/to/{to}")
	@GetMapping("metric-conversion-service/metric-conversion/from/{from}/to/{to}")
	public MetricCalculatorBean retrieveCalculatedValue(@PathVariable String from, @PathVariable String to);

}
