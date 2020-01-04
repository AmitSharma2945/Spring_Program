package com.nt.dto;

import lombok.Data;

@Data
public class BankDTO {

	private int srNo;
	private int bankid;
	private String bankname;
	private String branch ;
	private String ifsc;
	private String managername;
	private String area;
}
