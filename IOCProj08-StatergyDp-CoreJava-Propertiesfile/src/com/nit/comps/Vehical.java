package com.nit.comps;

public class Vehical {
	private IEnggine engg;
	//setter method
	public void setEngg(IEnggine engg) {
		this.engg = engg;
	}
	//B.logic method
	public void move(String source, String destination) {
		//start the Enggine
		engg.start();
		System.out.println("Journey Started from ::-"+source);
		System.out.println(" Journey is Going on...............");
		engg.stop();
		System.out.println("Journey Stopped at ::-"+destination);
	}
	

}
