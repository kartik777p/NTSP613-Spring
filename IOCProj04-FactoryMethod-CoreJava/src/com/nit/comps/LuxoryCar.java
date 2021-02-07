package com.nit.comps;

public class LuxoryCar implements ICar {
	
public LuxoryCar() {
System.out.println("LuxoryCar:: 0-param constructor");
}
	@Override
	public void drive() {
		System.out.println("Driving luxory car");
	}

	@Override
	public void addAssesories() {
		System.out.println("add Cover + merror to luxory car");

	}

}
