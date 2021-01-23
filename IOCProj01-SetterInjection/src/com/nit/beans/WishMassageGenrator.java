package com.nit.beans;

import java.util.Date;

public class WishMassageGenrator {
	private Date date;
	//cons
	public WishMassageGenrator() {
	System.out.println("WishMassageGenrator ::- 0 Param cons ");
	}
	//setter injection
	public void setDate(Date date) {
		this.date = date;
	}
	//B.logic method
	public String genrateWishMsg(String name) {
		int hour=0;
		hour=date.getHours();
		if(hour<=12)
		    return"Good morning "+name+" Todays date is::"+date ;
		else if(hour<=15)
		    return"Good Afternoon "+name+" Todays date is::"+date ;
		else if(hour<=18)
		    return"Good morning "+name+" Todays date is::"+date ;
		else 
			return"Good Night "+name+"Todays Date is  ::"+date;
	}//b.method
}//class
