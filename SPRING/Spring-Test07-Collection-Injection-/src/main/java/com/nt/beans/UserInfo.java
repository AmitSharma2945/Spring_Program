package com.nt.beans;

import java.util.Set;

import lombok.Setter;

@Setter
public class UserInfo {
	
	private Set<String> phoneNumber;


	@Override
	public String toString() {
		return "UserInfo [phoneNumber=" + phoneNumber + "]";
	}
	

}
