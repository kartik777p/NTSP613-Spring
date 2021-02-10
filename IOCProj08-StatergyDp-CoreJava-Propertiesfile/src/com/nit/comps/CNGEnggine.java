package com.nit.comps;


public class CNGEnggine implements IEnggine {
	
	public CNGEnggine() {
System.out.println("CNGEnggine:: 0-param Contructor");
	}

	@Override
	public void start() {
		System.out.println("CNG Enggine Started ");
	}

	@Override
	public void stop() {
		System.out.println("CNG Enggine Stopped ");
	}

}
