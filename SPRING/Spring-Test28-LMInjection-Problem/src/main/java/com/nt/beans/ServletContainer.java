package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class ServletContainer {
	private Requesthandle handler;
	int count ;
	
	public void setHandler(Requesthandle handler) {
		this.handler = handler;
	}

	public ServletContainer() {
		count++;
	System.out.println("ServletContainer.O-paramContstructor()"+count);
	}
	
	public void ProcessRequest(String data){
		System.out.println("ServletContainer.ProcessRequest()");
		handler.handle(data);
	}
	
	} 
	

