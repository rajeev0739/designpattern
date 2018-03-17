package com.rajeev.design.pattern.strategy.game;

public class King extends Character{

	
	public King() {
		weaponBehaviour=new SwordBehaviour();
	}
	
	@Override
	public void fight() {
		
		weaponBehaviour.useWeapon();
	}

}
