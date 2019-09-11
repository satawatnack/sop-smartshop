package com.smartshop.drinks.controller;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartshop.drinks.entity.Drink;
import com.smartshop.drinks.entity.DrinkFactory;
import com.smartshop.drinks.service.DrinkService;



@RestController
@Controller
public class DrinkController {
	@Autowired
	DrinkService drinkservice = DrinkService.getInstance();
	
	@GetMapping("/")
	public String home(){
		return "Today is a good day. what do you want to drink ? , qué quieres beber";
	}
	  
	@GetMapping("/drinks")
	public  List<Drink> getDrinks(){
		return drinkservice.getDrinks();
	}

	@GetMapping("/buy/{id}")
	public Drink buyDrink(@PathVariable Double id){
		return drinkservice.buyDrink(id);
	}
	
	@PostMapping("/addDrink")
    public String create(@RequestBody Map<String, String> body){
		double id = Double.parseDouble(body.get("id"));
		String name = body.get("name");
       	double price = Double.parseDouble(body.get("price"));
     	String detail = body.get("detail");
       	Drink var = DrinkFactory.create("drink");
       	var.setDrink(id, name, price, detail);
       	System.out.println(var);
        return drinkservice.addDrink(var);
    }
}
