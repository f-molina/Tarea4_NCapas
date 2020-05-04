package com.uca.capas.hibernate.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {

	@NotEmpty
	@Size(min = 12, max = 12, message = "El codigo debe de tener 12 digitos")
	@Digits(integer = 12, fraction = 0, message = "El codigo debe ser un numero entero")
	private String code;

	@NotEmpty
	@Size(max = 100, message = "Maximo 100 caracteres")
	private String name;

	@NotEmpty
	@Size(max = 100, message = "Maximo 100 caracteres")
	private String brand;

	@NotEmpty
	@Size(max = 500, message = "Maximo 500 caracteres")
	private String description;

	@NotEmpty
	@Digits(integer = 10, fraction = 0, message = "Debe ser entero")
	private String stock;	

	@NotEmpty
	@Pattern(regexp = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$",
	 message = "La fecha debe de estar en formato dd/mm/yyyy")
	private String inDate;

	public Product() {
		super();
	}

	public Product(String code, String name, String brand, String description, String stock, String inDate) {
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

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

}
