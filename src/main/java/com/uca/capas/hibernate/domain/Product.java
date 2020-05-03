package com.uca.capas.hibernate.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {

	@Size(min = 12, max = 12, message = "El codigo debe de tener 12 digitos")
	private String code;

	@Size(max = 100, message = "Maximo 100 caracteres")
	private String name;

	@Size(max = 100, message = "Maximo 100 caracteres")
	private String brand;

	@Size(max = 500, message = "Maximo 500 caracteres")
	private String description;

	private Integer stock;	

	@Pattern(regexp = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$",
	 message = "La fecha debe de estar en formato dd/mm/yyyy")
	private String inDate;

	public Product() {
		super();
	}

	public Product(String code, String name, String brand, String description, Integer stock, String inDate) {
		super();
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.stock = stock;
		this.inDate = inDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

}
