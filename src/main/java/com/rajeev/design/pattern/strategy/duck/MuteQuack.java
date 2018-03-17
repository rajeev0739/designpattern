package com.rajeev.design.pattern.strategy.duck;

public class MuteQuack implements QuackBehaviour{

	public void quack() {
		System.out.println("Silence");
		
	}

}
