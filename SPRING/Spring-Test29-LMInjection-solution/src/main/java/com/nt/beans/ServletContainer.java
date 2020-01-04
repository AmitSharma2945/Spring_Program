package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServletContainer implements ApplicationContextAware {
	
	private String handler;
	
	

	public void setHandler(String handler) {
		this.handler = handler;
	}

	public ServletContainer() {
	System.out.println("ServletContainer.O-paramContstructor()-1");
	}
	
	public void ProcessRequest(String data){
		System.out.println("ServletContainer.ProcessRequest()");
	Requesthandle req=ctx.getBean("handler",Requesthandle.class);
		req.handle(data);
	}
	ApplicationContext ctx;	
	
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx=ctx;
		
	} 
	
}
