package com.rajeev.design.pattern.strategy.duck;

/*
 * 
 * Version 1.0
 * public abstract class Duck {

	public abstract void quack();
	public abstract void swim();
	public abstract void display();
	public abstract void fly();
}
*/

public abstract class Duck {

   // Declare two reference variable for the behavior interface types all duck subclasses inherit these

	FlyBehaviour  flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public void performQuack() {
		// Delegate to behavior class
		quackBehaviour.quack();
	}
	
	public void performFly() {
		// Delegate to behavior class
		flyBehaviour.fly();
	}
	
	// Setting Behavior Dynamically
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
}