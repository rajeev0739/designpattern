package com.rajeev.design.pattern.strategy.duck;

/*public class RubberDuck extends Duck{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}*/



public class RubberDuck extends Duck{
	public RubberDuck() {
		quackBehaviour = new Quack();
		flyBehaviour   = new FlyNoWay();
	}

	public void display() {
		System.out.println("I'm a read RubberDuck Duck");
	}
	
}
