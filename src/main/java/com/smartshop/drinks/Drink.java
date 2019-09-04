package com.smartshop.drinks;

public class Drink {
	String name;
	Double price;
	String detail;
	
	public Drink(String name, Double price, String detail) {
		super();
		this.name = name;
		this.price = price;
		this.detail = detail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
