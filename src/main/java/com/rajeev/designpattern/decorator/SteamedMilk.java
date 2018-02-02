package com.rajeev.designpattern.decorator;

public class SteamedMilk extends CondimentDecorator{
	Beverage beverage;

	public SteamedMilk(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription()+" ,SteamedMilk ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.50+beverage.cost();
	}

}
