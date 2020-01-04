package com.nt.beans;

public class BankService {

	public float calcIntrAmt(float Pamt, float rate, float time) {
		System.out.println("Bank-Calculate");
		return Pamt * rate * time / 100.0f;

	}

}
