package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.BaseBO;

public class MyBeanPostProcess implements  BeanPostProcessor{
	
	public MyBeanPostProcess() {
	System.out.println("MyBeanPostProcess.MyBeanPostProcess()");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String bid)
			throws BeansException {
        System.out.println("BPP:BeforInitialization(-,-)");
        if(bean instanceof BaseBO){
        	((BaseBO) bean).setDoj(new Date());
        	return bean;
        }
        
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String bid)
			throws BeansException {
		System.out.println("BPP:AfterInitialization(-,-)");
		return bean;
	}
	


}
