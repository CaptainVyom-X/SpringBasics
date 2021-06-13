package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator : one-param constructor");
		this.date = date;
	}

	public String generateWishMsg(String name) {
		System.out.println("WishMessageGenerator.generateWishMsg(-)");
		int hour = 0;
		// get current hour of the day
		hour = date.getHours(); // 0-23 (24 hour format)
		if (hour < 12)
			return "Good Morning " + name;
		else if (hour < 15)
			return "Good Afternoon " + name;
		else if (hour < 20)
			return "Good Evening " + name;
		else
			return "Good Night " + name;
	}// method

}// class
