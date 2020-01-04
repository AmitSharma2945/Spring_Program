package com.nt.beans;

import java.util.Date;

public class BeanCycle {
	private String name;
	private int age;
	private String addrs;
	private float salary;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public BeanCycle() {
	System.out.println("BeanCycle.O-param Constructor()");
	}

public void myinit() {
	
	System.out.println("BeanCycle.myinit()");
	if (name==null || age<0) 
		throw new IllegalArgumentException("Must set the values variable");
}
	
	public String checkVotingEligiblity() {
	 System.out.println("BeanCycle.checkVotingEligiblity()");
		if (age>18) {
			
			return name+"You are Eligible Voting";
		}
		else {
	     return name+"SorrY Next Time Try Beta ";
	}
 }
 	public void Destroy() {
	System.out.println("BeanCycle.myDestroy()");	
	name=null;
	age=0;
	addrs=null;
	salary=0;
}
	
}
