package com.nt.beans;

public class TravelAgent {

	private TourPlane tp;

	public TravelAgent() {
	System.out.println("TourPlan.O-param Constructer");
	}

	public TravelAgent(TourPlane tp) {
		System.out.println("TourPlan.1-param Constructer");
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TourPlan [tp=" + tp + "]";
		
	}

}
