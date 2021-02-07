package com.nit.comps;

public class SportCar implements ICar {
	
	public SportCar() {
	System.out.println("SportCar::- 0-param contructor");
	}

	@Override
	public void drive() {
		System.out.println("Driving Sport Car");
	}

	@Override
	public void addAssesories() {
		System.out.println("Add mirror to Sport car");
	}

}
