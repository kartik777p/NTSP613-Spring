package com.nit.beans;

import java.util.Date;

public class WishMassageGenrator {
	private Date date;
	//cons injection
	public WishMassageGenrator(Date date) {
		System.out.println("WishMassageGenrator::- 1-param contructor ");
		this.date = date;
	}
	//b.logic method
	public String genrateWishMsg(String name) {
		int hour=0;
		//get hours
		hour=date.getHours();
		//display hours
		System.out.println("current hour is::-"+hour);
		//write b.logic
		if(hour<=12)
			return"Good Morning ::-"+name+" Todays Date is ::-"+date;
		else if(hour<=15)
			return"Good Morning ::-"+name+" Todays Date is ::-"+date;
		else if(hour<=18)
			return"Good Morning ::-"+name+" Todays Date is ::-"+date;
		else
			return"Good Night ::- "+name+" Todays date is ::-"+date;
		
	}
	
	

}
