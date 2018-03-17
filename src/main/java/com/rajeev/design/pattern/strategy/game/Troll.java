package com.rajeev.design.pattern.strategy.game;

public class Troll extends Character{

	public Troll() {
		weaponBehaviour=new AxeBehavior();
	}
	
	@Override
	public void fight() {
		
		weaponBehaviour.useWeapon();
	}

}
