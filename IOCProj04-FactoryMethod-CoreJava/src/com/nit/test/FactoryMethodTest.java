package com.nit.test;

import com.nit.comps.ICar;
import com.nit.factory.CarFactory;

public class FactoryMethodTest {

	public static void main(String[] args) {
		ICar car=null;
		//get obj from Carfactory
		car=CarFactory.getInstance("budget");
		//call our method
		car.drive();
		car.addAssesories();
	}
}
