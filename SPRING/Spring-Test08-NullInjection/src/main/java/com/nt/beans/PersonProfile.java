package com.nt.beans;

import java.util.Date;

public class PersonProfile {
	
	private int pid;
	private String pname;
	private String addrs;
	private Date dob;
	private Date doj;
	private Date dom;
	
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	@Override
	public String toString() {
		return "NullInjectionTest [pid=" + pid +", pname=" + pname + ", addrs=" + addrs + ", dob=" + dob + ", doj="
				+ doj + ", dom=" + dom + "]";
	}
	

}
