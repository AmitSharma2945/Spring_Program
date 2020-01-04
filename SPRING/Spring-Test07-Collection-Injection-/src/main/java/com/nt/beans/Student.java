package com.nt.beans;

import java.util.Arrays;

import lombok.Setter;

@Setter
public class Student {
  
	private int marks[]; 
	
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + "]";
	}
}

