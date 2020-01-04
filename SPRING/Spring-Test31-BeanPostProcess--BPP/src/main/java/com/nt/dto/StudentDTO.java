package com.nt.dto;

import com.nt.bo.BaseBO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class StudentDTO extends BaseBO {

	private String qlfy;
	private String course;


}
