
package com.rajeev.designpattern.decorator;


public abstract class Beverage {

	String description="Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	
	// need to implement in sub-class 
	public abstract double cost();
	



}
