package com.smartshop.drinks;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DrinksApplication {
	DrinkService drinkService = new DrinkService();
		
	@RequestMapping("/")
	String home(){
		return "Hello World";
	}
	  
	@GetMapping("/drinks")
	public  List<Drink> getDrinks(){
		return drinkService.getDrinks();
	}

	@GetMapping("/buy/{name}")
	public Double buyDrink(@PathVariable String name){
		return drinkService.buyDrink(name);
	}
	
	@PostMapping("/addDrink")
    	public String create(@RequestBody Map<String, String> body){
		String name = body.get("name");
        double price = Double.parseDouble(body.get("price"));
        String detail = body.get("detail");
        return drinkService.addDrink(name, price, detail);
    }
	
	public static void main(String[] args) {
		
		SpringApplication.run(DrinksApplication.class, args);
	}

}
