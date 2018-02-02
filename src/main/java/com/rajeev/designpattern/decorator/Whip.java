

package com.rajeev.designpattern.decorator;

public class Whip extends CondimentDecorator{
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription()+" ,Whip ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.40+beverage.cost();
	}

}
