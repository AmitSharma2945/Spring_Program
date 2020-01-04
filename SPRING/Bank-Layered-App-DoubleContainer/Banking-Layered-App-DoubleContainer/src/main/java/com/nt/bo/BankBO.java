package com.nt.bo;

import lombok.Data;

@Data
public class BankBO {

	private int bankid;
	private String bankname;
	private String branch ;
	private String ifsc;
	private String managername;
	private String area;
}
