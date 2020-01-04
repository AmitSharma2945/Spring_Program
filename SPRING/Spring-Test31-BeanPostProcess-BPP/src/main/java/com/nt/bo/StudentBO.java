package com.nt.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class StudentBO extends BaseBO {
	
	private String qlfy;
	private String course;
}
