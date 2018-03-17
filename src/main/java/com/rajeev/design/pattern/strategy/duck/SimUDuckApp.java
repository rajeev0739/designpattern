package com.rajeev.design.pattern.strategy.duck;

public class SimUDuckApp {
	
	public static void main(String[] args) {
		Duck mallard=new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model=new ModelDuck();
	
		model.performFly();
		
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}

}
