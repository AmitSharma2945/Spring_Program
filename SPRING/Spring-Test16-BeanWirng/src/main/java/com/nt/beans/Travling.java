package com.nt.beans;

public class Travling {
	 
	private String tour;

	
	public Travling() {
	System.out.println("Travling.O-param Constucter");	
	}
	
	public void setTour(String tour) {
		this.tour = tour;
	}

	@Override
	public String toString() {
		return "Travling [tour=" + tour + "]";
	}
	
}
