package com.nt.beans;

import java.util.List;
import java.util.Set;

import lombok.Setter;

@Setter
public class Courses {
	 
	Set<String>courses=null;
	List<String>names=null;
	
	
	@Override
	public String toString() {
		return "Courses [courses=" + courses + "\n, names=" + names + "]";
	}

	
}


