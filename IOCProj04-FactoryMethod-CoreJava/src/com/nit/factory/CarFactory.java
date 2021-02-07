package com.nit.factory;

import com.nit.comps.BudgetCar;
import com.nit.comps.ICar;
import com.nit.comps.LuxoryCar;
import com.nit.comps.SportCar;

public class CarFactory {
	
	public static ICar getInstance(String type) {
		ICar car=null;
		//check type and create obj based on that type
		if(type.equalsIgnoreCase("sport"))
			car=new SportCar();
		else if(type.equalsIgnoreCase("luxory"))
			car=new LuxoryCar();
		else if(type.equalsIgnoreCase("budget"))
			car=new BudgetCar();
		else
			throw new IllegalArgumentException("Invalid type ");
		//return car obj
		return car;	
	}
}
