package com.consumer.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.services.CarsServiceProxy;
import com.consumer.util.InstanceInformationService;

@RestController
public class DataController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CarsServiceProxy proxy;

	@Autowired
	private InstanceInformationService instanceInformationService;

	@GetMapping("/init")
	public String imHealthy() {
		return "{init:true}";
	}

	@GetMapping("/store/inventory")
	public List<CarsBean> convertCurrency() {

		logger.info("=========================================================");
		logger.info("Request to fetch all cars from Consumer service initiated");
		logger.info("=========================================================\n");

		return proxy.getCars();
	}

	@GetMapping("/instanceInfo")
	public String instanceDetails() {
		return instanceInformationService.retrieveInstanceInfo();
	}
}
