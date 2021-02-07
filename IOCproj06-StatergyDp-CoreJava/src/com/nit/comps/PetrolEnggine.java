package com.nit.comps;

public class PetrolEnggine implements IEnggine {

	public PetrolEnggine() {
	System.out.println("PetrolEnggine:: 0-param Contructor");
	}
	@Override
	public void start() {
		System.out.println("Petrol Enggine Started ");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Enggine Stopped ");
	}

}
