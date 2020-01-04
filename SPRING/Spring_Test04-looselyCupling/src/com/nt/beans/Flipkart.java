package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier Courier;
	
	
	public Flipkart(Courier courier) {
		System.out.println("Flipkart.Constructor 1-param()");
		Courier = courier;
	}
	
	public void setCourier(Courier courier) {
	System.out.println("Flipkart.setCourier()");
		Courier = courier;
	}

	public String Shopping(String items[],float prices[]) {
		float billamt=0.0f;
		int ord=0;
		String msg=null;
		
		for(float price:prices)
		billamt=billamt+price;
		
		ord= new Random().nextInt(100000);	
		msg=Courier.deliver(ord);
		
		return Arrays.toString(items)+"having a price"+Arrays.toString(prices)+"Billamt"+billamt;
		
	}

}
