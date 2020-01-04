package com.nt.beans;

import java.util.Arrays;

public class TourPlane {
	
	private String[] places;
   
	public void setPlaces(String[] places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "TourPlane [places=" + Arrays.toString(places) + "]";
	}

}
