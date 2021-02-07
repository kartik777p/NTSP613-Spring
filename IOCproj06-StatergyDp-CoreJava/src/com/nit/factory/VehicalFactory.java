package com.nit.factory;

import com.nit.comps.CNGEnggine;
import com.nit.comps.DeiselEnggine;
import com.nit.comps.IEnggine;
import com.nit.comps.PetrolEnggine;
import com.nit.comps.Vehical;

public class VehicalFactory {

	public static Vehical getInstance(String enggType) {
		Vehical vehical = null;
		IEnggine engg = null;
		// create target class obj
		vehical = new Vehical();
		// create dept class obj based on input
		if (enggType.equalsIgnoreCase("petrol"))
			engg = new PetrolEnggine();
		else if (enggType.equalsIgnoreCase("deisel"))
			engg = new DeiselEnggine();
		else if(enggType.equalsIgnoreCase("CNG"))
			engg=new CNGEnggine();
		//assign dependent class obj to target class
		//assign Enggtype to Vehical
		vehical.setEngg(engg);
		//return vehical obj having depend class obj 
           return vehical;
	}

}
