package com.rajeev.design.pattern.strategy.duck;


// https://en.wikipedia.org/wiki/Redhead_(bird)

/*public class RedHeadDuck extends Duck{

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
		
	}*/




public class RedHeadDuck extends Duck{
	public RedHeadDuck() {
		quackBehaviour = new Quack();
		flyBehaviour   = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a read RedHeadDuck Duck");
	}
	
}


