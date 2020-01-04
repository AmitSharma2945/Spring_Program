package com.nt.beans;

import java.util.List;

public class EnngCourse {
	
	private List<String> course;

	public void setCourse(List<String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "EnngCourse [course=" + course + "]";
	}
	

}
