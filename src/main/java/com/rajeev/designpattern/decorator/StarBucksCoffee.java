package com.rajeev.designpattern.decorator;

public class StarBucksCoffee {

	public static void main(String[] args) {
	
		
		Beverage beverage=new Espresso();
				
        System.out.println(beverage.getDescription()+" $ "+beverage.cost());
        
        Beverage beverage2=new DarkRoast(); // This is base component/concrete component which we need to decorate
        beverage2=new Mocha(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        
        System.out.println(beverage2.getDescription()+" $ "+beverage2.cost());
        
        Beverage beverage3=new HouseBlend();
        beverage3=new Soy(beverage2);
        beverage3=new Mocha(beverage2);
        beverage3=new Whip(beverage2);
        
        System.out.println(beverage2.getDescription()+" $ "+beverage3.cost());
        
		
	}

}
