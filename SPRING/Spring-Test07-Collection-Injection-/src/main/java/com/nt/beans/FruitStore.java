package com.nt.beans;

import java.util.Map;

import lombok.Setter;

@Setter
public class FruitStore {
	
	private Map<String, String> fruit;

	@Override
	public String toString() {
		return "FruitStore [fruit=" + fruit + "]";
	}

}

