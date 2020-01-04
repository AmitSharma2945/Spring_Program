package com.nt.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

import lombok.Data;

@Data
public class InterRateReplacer implements MethodReplacer {

	private float Pamt, rate, time;

	public InterRateReplacer() {
		System.out.println("InterRateReplacer O-paramConstructor");
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("InterRateReplacer.reimplement()");
		System.out.println("object Class.." + obj.getClass());
		System.out.println("method Name.." + method.getName());
		System.out.println("Object[] Args.." + Arrays.toString(args));

		float Pamt = (Float) args[0];
		float rate = (Float) args[1];
		float time = (Float) args[2];

		return (Pamt*Math.pow(rate/100,time))-Pamt;
	}
}
