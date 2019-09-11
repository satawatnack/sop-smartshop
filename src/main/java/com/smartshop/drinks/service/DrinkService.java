package com.smartshop.drinks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartshop.drinks.entity.Drink;
import com.smartshop.drinks.repository.DrinkRepository;

@Service
public class DrinkService{
	@Autowired
	private DrinkRepository drinkRepository;
	
	private static DrinkService instance = new DrinkService();
	public static DrinkService getInstance() {
	    return instance;
	}
	    
	public Drink buyDrink(Double id) {
		for(Drink var: drinkRepository.findAll()) {
			System.out.println(id+" "+ var.getName());
			if(var.getId()==id){
				return drinkRepository.findOne(id);
			}
		}
		return null;
	}
	
	public List<Drink> getDrinks(){
		return drinkRepository.findAll();
	}
	
	public String addDrink(Drink drink){
		drinkRepository.save(drink);
		return "add drink success";
	}
	
}
