package com.rajeev.design.pattern.strategy.duck;


// https://en.wikipedia.org/wiki/Mallard

/*public class MallardDuck extends Duck{

	@Override
	public void quack() {
		
		
	}

	@Override
	public void swim() {
		
		
	}

	@Override
	public void display() {
		
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	*/

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour   = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a read Mallard Duck");
	}
	

}
