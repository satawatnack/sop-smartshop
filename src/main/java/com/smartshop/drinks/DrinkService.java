package com.smartshop.drinks;

import java.util.ArrayList;
import java.util.List;

public class DrinkService {

	static ArrayList<Drink> drinkList = new ArrayList<Drink>();
	static {
		drinkList.add(DrinkFactory.createDrink("Johnnie Walker - Black Label 12 Year Old", 28.19, "The colour black has always been associated with style and elegance. The little black dress is always a sophisticated choice whereas the traditional tux can transform any man's appearance.\r\n" + 
				"\r\n" + 
				"But black is also intriguing. It has a hint of mystery, of something waiting to be revealed. This is Johnnie Walker Black Label - a deep and complex flavour which is also an unquestionable mark of power and refinement. It is a luxury blend and a luxury brand, with a completely individual personality.\r\n" + 
				"\r\n" + 
				"As many as 40 whiskies, each aged 12 years or more, make up this satisfyingly complex blend.\r\n" + 
				"\r\n" + 
				"Decade after decade, Black Label wins awards and accolades. Experts consistently appreciate its understated, classic qualities."));
		drinkList.add(DrinkFactory.createDrink("Jack Daniels - Old No 7", 23.57, "The archetypal JD and the most famous of all the range from this famous American whiskey producer.\r\n" + 
				"\r\n" + 
				"Described as a sipping whiskey and produced in Lynchburg, Tennessee, JD use pure cave spring water and their unique 'mellowing' process which was perfected by Jack Daniel in 1866, where it is filtered through maple charcoal, giving it's distinctive, more 'mellow' and sweeter flavour than bourbon.\r\n" + 
				"\r\n" + 
				"Known uniquely as Tennessee whiskey, it is not subject to the regulations relating to bourbons, including the need to use new barrels. for ageing."));
		drinkList.add(DrinkFactory.createDrink("Chivas Regal - 12 Year Old", 26.14, "Nose: Orchard fruits and wild herbs.\r\n" + 
				"\r\n" + 
				"Taste: Honey and butterscotch with apricots and hazelnuts.\r\n" + 
				"\r\n" + 
				"Finish: Rich and generous.\r\n" + 
				"\r\n" + 
				"How to enjoy Chivas Regal 12 year old at its best. As you wish: on the rocks or accessing the subtle warm flavours in the form of a deliciously simple yet classic cocktail.\r\n" + 
				"\r\n" + 
				"Distinguished by its light, lingering aroma, full, smooth palate and balanced flavour with a hint of smoke, Chivas Regal is a Scotch of subtle and complex character.\r\n" + 
				"\r\n" + 
				"From its origins at Strathisla - the oldest operating distillery in The Highlands - this blend of the finest malt and mature grain whiskies deserves the accolade 'Scotland's Prince of Whiskies'."));
		drinkList.add(DrinkFactory.createDrink("Johnnie Walker - Blue Label", 162.47, "2015 limited edition available while stocks last.\r\n" + 
				"\r\n" + 
				"Johnnie Walker Blue Label is their rarest blend. This isn't a whisky for beginners. It's challenging and an acquired taste, but like the finest rewards in life is worth it.\r\n" + 
				"\r\n" + 
				"Created from the rarest and most expensive whiskies in the world, Blue Label has the authentic character and flavour of a traditional nineteenth century blend, just like those that John Walker and his son Alexander developed for their most valued customers.\r\n" + 
				"\r\n" + 
				"Blue Label is made from a few exceptional whiskies with powerful flavours. Each bottle is precious and individually numbered. Each contains a rare taste and gives an intense experience.\r\n" + 
				"\r\n" + 
				"Blue Label is the ultimate luxury Scotch Whisky and supplies of Blue Label are limited by the rarity and expense of the whiskies used in the blend.\r\n" + 
				"\r\n" + 
				"At the heart of Blue Label is Royal Lochnagar, a rare malt distilled near Balmoral, the Queen's holiday home. Around 15 other mature and precious whiskies are added to balance Blue Label perfectly - 'a blend that cannot be beat', (Alexander Walker, 1888)."));
		drinkList.add(DrinkFactory.createDrink("Sheridans", 18.07, "Visually stunning, it is owned by Gilbey's, the same group that produces Baileys.\r\n" + 
				"\r\n" + 
				"Sheridan, with its white liqueur having a white chocolate richness, and the black of warm coffee and whiskey, the whole rounded off by a chocolate & nutty finish."));
	}
	
	
	public Double buyDrink(String name) {
		for(Drink var: drinkList) {
			System.out.println(name+" "+ var.getName());
			if(var.getName().equals(name)){
				return var.price;
			}
		}
		return null;
	}
	
	public List<Drink> getDrinks(){
		return drinkList;
	}
	
	public String addDrink(String name, Double price, String detail){
		drinkList.add(DrinkFactory.createDrink(name, price, detail));
		return "add drink success";
	}
	
}
