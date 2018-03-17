package com.rajeev.design.pattern.strategy.duck;

public class ModelDuck extends Duck{
	public ModelDuck() {
		quackBehaviour = new Quack();
		flyBehaviour   = new FlyNoWay();
	}

	public void display() {
		System.out.println("I'm a read ModelDuck ");
	}
}

