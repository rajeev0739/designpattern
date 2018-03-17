package com.rajeev.design.pattern.strategy.game;

public abstract class Character {
	
	WeaponBehaviour weaponBehaviour;
	
	public abstract void fight();
	
	public  void setWeapon(WeaponBehaviour weaponBehaviour) {
		this.weaponBehaviour=weaponBehaviour;
	}

}
