package com.smartshop.drinks;

public class DrinkFactory {
	public static Drink createDrink(String name, Double price, String detail) {
		if(name == null || price == null || detail == null) {
			return null;
		}
		return new Drink(name, price, detail);
	}
}