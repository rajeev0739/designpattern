package com.rajeev.design.pattern.strategy.game;

public class Knight extends Character{
	
	public Knight() {
		weaponBehaviour=new BowAndArrowBehavior();
	}

	@Override
	public void fight() {
		weaponBehaviour.useWeapon();
		
	}
	
	

}
