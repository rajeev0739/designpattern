package com.rajeev.design.pattern.strategy.game;

public class Queen extends Character {
	public Queen() {
		weaponBehaviour=new KnifeBehaviour();
	}
	
	@Override
	public void fight() {
		
		weaponBehaviour.useWeapon();
	}

}
