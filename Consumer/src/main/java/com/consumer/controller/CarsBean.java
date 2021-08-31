package com.consumer.controller;

public class CarsBean {

	private Long id;
	private String manufacturer;
	private String model;
	int build;

	public CarsBean(Long id, String manufacturer, String model, int build) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.build = build;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getBuild() {
		return build;
	}

	public void setBuild(int build) {
		this.build = build;
	}

}
