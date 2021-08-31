package com.truckla.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsInventoryApplication {

	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path", "/cars-inventory");
		SpringApplication.run(CarsInventoryApplication.class, args);
	}

}
