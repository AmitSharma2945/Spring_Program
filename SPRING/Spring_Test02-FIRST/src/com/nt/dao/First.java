package com.nt.dao;


public class First {

	static {
		System.out.println("Static Block");
	}
	
	public First() {
		System.out.println("param-o-Constructor");
	}
	
	public First(int x) {
		System.out.println("one param-Constructor");
	}
	
	public void disp(String name) {
		System.out.println("Name"+name);
	}

	@Override
	public String toString() {
		return "First []";
				
	}

	

}
