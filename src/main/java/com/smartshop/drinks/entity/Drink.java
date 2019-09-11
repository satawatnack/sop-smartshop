package com.smartshop.drinks.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drink {
	@Id
    private double id;
	String name;
	Double price;
	String detail;
	public Drink() {
		
	}
	public Drink(double id, String name, Double price, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
	}
	public void setDrink(double id, String name, Double price, String detail) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
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
