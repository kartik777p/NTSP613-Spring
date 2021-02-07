package com.nit.comps;

public class BudgetCar implements ICar {
	public BudgetCar() {
	System.out.println("BudgetCar :: 0-param contructor");
	}

	@Override
	public void drive() {
		System.out.println("Driving budget car ");
	}

	@Override
	public void addAssesories() {
		System.out.println(" Add cover to budget car");
	}

}
