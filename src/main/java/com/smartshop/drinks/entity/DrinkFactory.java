package com.smartshop.drinks.entity;

public class DrinkFactory {
	public static Drink create(String name) {
		if(name == null) {
			return null;
		}
		else if (name.equals("drink")) {
			return new Drink();
		}
		return null;
	}
}