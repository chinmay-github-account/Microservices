package com.consumer.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.consumer.controller.CarsBean;

@FeignClient(name = "Producer", url = "${PRODUCER_SERVICE_HOST:http://localhost:8443}")
public interface CarsServiceProxy {

	@GetMapping("/producer/cars")
	public List<CarsBean> getCars();
}
