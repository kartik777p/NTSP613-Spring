package com.nit.test;

import com.nit.comps.Vehical;
import com.nit.factory.VehicalFactory;

public class StatergyDpTest {

	public static void main(String[] args) {
		Vehical vehical=null;
		//create vehical class obj from VehicalFactory
		vehical=VehicalFactory.getInstance("Deisel");
		//call b.method
		vehical.move("akola","Hyd");
	}

}
