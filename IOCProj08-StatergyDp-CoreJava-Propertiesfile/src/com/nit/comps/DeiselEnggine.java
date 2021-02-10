package com.nit.comps;

public class DeiselEnggine implements IEnggine {

	public DeiselEnggine() {
	System.out.println("DeiselEnggine:: 0-param Contructor");
	}
	@Override
	public void start() {
		System.out.println("Deisel Enggine Started ");
	}

	@Override
	public void stop() {
		System.out.println("Deisel Enggine Stopped ");
	}

}
