package com.rajeev.design.pattern.strategy.duck;

// https://en.wikipedia.org/wiki/Duck_decoy_(model)
/*public class DecoyDuck extends Duck{

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

public class DecoyDuck extends Duck{
	public DecoyDuck() {
		quackBehaviour = new Quack();
		flyBehaviour   = new FlyWithWings() ;
	}

	public void display() {
		System.out.println("I'm a read DecoyDuck Duck");
	}
	
}
